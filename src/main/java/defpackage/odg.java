package defpackage;

/* renamed from: odg */
public class odg {
    public int flags;

    public void clear() {
        this.flags = 0;
    }

    public final boolean isDecodeOnly() {
        return getFlag(aocf.UNSET_ENUM_VALUE);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void addFlag(int i) {
        this.flags = i | this.flags;
    }

    public final void clearFlag(int i) {
        this.flags = (i ^ -1) & this.flags;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean getFlag(int i) {
        return (this.flags & i) == i;
    }
}
