package defpackage;

/* renamed from: ona */
public abstract class ona implements oll {
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String str = "SCTE-35 splice command: type=";
        return simpleName.length() == 0 ? new String(str) : str.concat(simpleName);
    }
}
