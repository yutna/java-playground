class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;
    static final int TESTERR = 4;

    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds",
            "Test Static final"
    };

    String getErrorMsg(int i, final int LUCKYNUMBER) {
        System.out.println("Print final parameter: " + LUCKYNUMBER);
        if ((i >= 0) & (i < msgs.length))
            return msgs[i];
        return "Invalid Error Code";
    }
}
