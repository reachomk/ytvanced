package defpackage;

/* renamed from: barn */
public enum barn {
    Continuation(0),
    Text(1),
    Binary(2),
    Close(8),
    Ping(9),
    Pong(10);
    
    public final byte g;

    private barn(int i) {
        this.g = (byte) i;
    }

    public final boolean a() {
        return this == Close || this == Ping || this == Pong;
    }
}
