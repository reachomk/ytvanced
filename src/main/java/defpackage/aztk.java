package defpackage;

/* renamed from: aztk */
public final class aztk extends anxo implements anzf {
    private aztk() {
        super(aztl.b);
    }

    public final aztk a(String str, aztm aztm) {
        if (str == null) {
            throw new NullPointerException();
        } else if (aztm != null) {
            copyOnWrite();
            aztl aztl = (aztl) this.instance;
            anyy anyy = aztl.a;
            if (!anyy.a) {
                aztl.a = anyy.a();
            }
            aztl.a.put(str, aztm);
            return this;
        } else {
            throw new NullPointerException();
        }
    }

    /* synthetic */ aztk(byte b) {
        super(aztl.b);
    }
}
