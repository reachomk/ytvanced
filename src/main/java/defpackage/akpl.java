package defpackage;

/* renamed from: akpl */
public abstract class akpl implements akot {
    public abstract void a(akor akor, Object obj);

    public abstract byte[] a(Object obj);

    public final void a_(akor akor, Object obj) {
        byte[] a = a(obj);
        if (a != null && a.length > 0) {
            akor.a.a(a, null);
        }
        a(akor, obj);
    }
}
