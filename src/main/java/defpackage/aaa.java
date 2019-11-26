package defpackage;

/* renamed from: aaa */
public final class aaa extends aab {
    private final Object a = new Object();

    public aaa(int i) {
        super(i);
    }

    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    public final boolean a(Object obj) {
        boolean a;
        synchronized (this.a) {
            a = super.a(obj);
        }
        return a;
    }
}
