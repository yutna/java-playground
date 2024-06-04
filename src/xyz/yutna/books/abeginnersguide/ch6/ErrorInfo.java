package xyz.yutna.books.abeginnersguide.ch6;

class ErrorInfo {
    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };

    int[] howBad = { 3, 3, 2, 4 };

    Err getErrorInfo(int i) {
        if ((i >= 0) & (i < msgs.length))
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}
