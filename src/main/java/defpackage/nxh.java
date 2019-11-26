package defpackage;

/* renamed from: nxh */
public class nxh {
    public static final int FLAG_DECODE_ONLY = 2;
    public static final int FLAG_END_OF_STREAM = 1;
    public int flags;

    public void reset() {
        this.flags = 0;
    }

    public final void setFlag(int i) {
        this.flags = i | this.flags;
    }

    public final boolean getFlag(int i) {
        return (this.flags & i) == i;
    }
}
