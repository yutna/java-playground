package xyz.yutna.books.beginnersguide.ch6;

public class ErrorInfo {
    public String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };

    public int[] howBad = { 3, 3, 2, 4 };

    public Err getErrorInfo(int i) {
        if ((i >= 0) & (i < msgs.length))
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}
