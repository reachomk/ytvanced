package defpackage;

/* renamed from: epc */
public final class epc {
    public final akoh a = new akoh();
    public aknh b = new akpk();
    public Object c;
    public aknh d = new akpk();
    public aknh e = new akpk();
    private Object f;

    public epc() {
        this.a.a(this.b);
        this.a.a(this.e);
        this.a.a(this.d);
    }

    public final void a(Object obj) {
        if (obj != this.f) {
            this.f = obj;
            aknh akpk = new akpk();
            if (obj != null) {
                akpk.add(0, obj);
            }
            this.a.a(this.d, akpk);
            this.d = akpk;
        }
    }

    public final void a(aknh aknh) {
        if (this.e != aknh) {
            if (aknh == null) {
                aknh = new akpk();
            }
            this.a.a(this.e, aknh);
            this.e = aknh;
        }
    }
}
