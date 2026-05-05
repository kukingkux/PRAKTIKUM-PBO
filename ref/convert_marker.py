import os
import sys

from marker.scripts.convert import process_single_pdf, worker_init


def main() -> int:
    in_folder = os.path.abspath(sys.argv[1]) if len(sys.argv) > 1 else os.getcwd()
    out_folder = os.path.join(in_folder, "md")
    os.makedirs(out_folder, exist_ok=True)

    cli_options = {
        "output_dir": out_folder,
        "output_format": "markdown",
        "skip_existing": True,
        "debug_print": False,
        "disable_tqdm": True,
        "disable_multiprocessing": True,
        "page_range": None,
        "chunk_idx": 0,
        "num_chunks": 1,
        "max_files": None,
        "workers": 1,
        "max_tasks_per_worker": 1,
        "total_torch_threads": 2,
        "disable_image_extraction": False,
        "disable_ocr": False,
        "config_json": None,
        "processors": None,
        "llm_service": None,
        "converter_cls": None,
        "lowres_image_dpi": 96,
        "highres_image_dpi": 192,
    }

    pdfs = [
        os.path.join(in_folder, n)
        for n in os.listdir(in_folder)
        if n.lower().endswith(".pdf") and os.path.isfile(os.path.join(in_folder, n))
    ]
    pdfs.sort()

    worker_init()
    for fpath in pdfs:
        process_single_pdf((fpath, dict(cli_options)))

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
