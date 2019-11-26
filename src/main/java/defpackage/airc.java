package defpackage;

/* renamed from: airc */
public enum airc {
    DEFAULT(0),
    MINIMIZED(1),
    FULLSCREEN(2),
    BACKGROUND(3),
    INLINE_IN_FEED(5),
    VIRTUAL_REALITY(6),
    PICTURE_IN_PICTURE(7),
    REMOTE(-1);
    
    public final int i;

    private airc(int i) {
        this.i = i;
    }

    public final String a() {
        return String.valueOf(this.i);
    }
}
