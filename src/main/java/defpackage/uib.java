package defpackage;

/* renamed from: uib */
public final class uib extends uif {
    uib(String str, uij uij, uig... uigArr) {
        super(str, uij, uigArr);
    }

    public final void a(Object... objArr) {
        boolean z = false;
        if (this.d.length == objArr.length) {
            if (this.e) {
                int i = 0;
                while (true) {
                    uig[] uigArr = this.d;
                    if (i >= uigArr.length) {
                        break;
                    }
                    Class cls = uigArr[i].b;
                    if (cls != String.class) {
                        if (cls == Integer.class && !(objArr[i] instanceof Integer)) {
                            break;
                        }
                    } else if (!(objArr[i] instanceof String)) {
                        break;
                    }
                    if (cls == Boolean.class && !(objArr[i] instanceof Boolean)) {
                        break;
                    }
                    i++;
                }
            }
            z = true;
        }
        amqw.a(z);
        Long valueOf = Long.valueOf(1);
        uhz uhz = new uhz(objArr);
        synchronized (this.b) {
            uic uic = (uic) this.f.get(uhz);
            if (uic == null) {
                uic = new uie();
                this.f.put(uhz, uic);
            }
            uic.a(valueOf);
            this.g++;
        }
        uik a = this.a.a();
        if (a != null) {
            a.a();
        }
    }
}
