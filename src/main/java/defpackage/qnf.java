package defpackage;

/* renamed from: qnf */
public final class qnf extends rio {
    public Integer a = null;
    public qnd[] b;
    public qni[] c;
    private qne[] d;

    public qnf() {
        if (qnd.a == null) {
            synchronized (ris.b) {
                if (qnd.a == null) {
                    qnd.a = new qnd[0];
                }
            }
        }
        this.b = qnd.a;
        if (qne.a == null) {
            synchronized (ris.b) {
                if (qne.a == null) {
                    qne.a = new qne[0];
                }
            }
        }
        this.d = qne.a;
        if (qni.a == null) {
            synchronized (ris.b) {
                if (qni.a == null) {
                    qni.a = new qni[0];
                }
            }
        }
        this.c = qni.a;
        this.V = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        int i;
        riu riu;
        Integer num = this.a;
        if (num != null) {
            rim.a(1, num.intValue());
        }
        qnd[] qndArr = this.b;
        int i2 = 0;
        if (qndArr != null && qndArr.length > 0) {
            i = 0;
            while (true) {
                qnd[] qndArr2 = this.b;
                if (i >= qndArr2.length) {
                    break;
                }
                riu = qndArr2[i];
                if (riu != null) {
                    rim.a(2, riu);
                }
                i++;
            }
        }
        qne[] qneArr = this.d;
        if (qneArr != null && qneArr.length > 0) {
            i = 0;
            while (true) {
                qne[] qneArr2 = this.d;
                if (i >= qneArr2.length) {
                    break;
                }
                riu = qneArr2[i];
                if (riu != null) {
                    rim.a(3, riu);
                }
                i++;
            }
        }
        qni[] qniArr = this.c;
        if (qniArr != null && qniArr.length > 0) {
            while (true) {
                qniArr = this.c;
                if (i2 >= qniArr.length) {
                    break;
                }
                riu riu2 = qniArr[i2];
                if (riu2 != null) {
                    rim.a(4, riu2);
                }
                i2++;
            }
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int i;
        riu riu;
        int a = super.a();
        Integer num = this.a;
        if (num != null) {
            a += rim.b(1, num.intValue());
        }
        qnd[] qndArr = this.b;
        int i2 = 0;
        if (qndArr != null && qndArr.length > 0) {
            i = a;
            a = 0;
            while (true) {
                qnd[] qndArr2 = this.b;
                if (a >= qndArr2.length) {
                    break;
                }
                riu = qndArr2[a];
                if (riu != null) {
                    i += rim.b(2, riu);
                }
                a++;
            }
            a = i;
        }
        qne[] qneArr = this.d;
        if (qneArr != null && qneArr.length > 0) {
            i = a;
            a = 0;
            while (true) {
                qne[] qneArr2 = this.d;
                if (a >= qneArr2.length) {
                    break;
                }
                riu = qneArr2[a];
                if (riu != null) {
                    i += rim.b(3, riu);
                }
                a++;
            }
            a = i;
        }
        qni[] qniArr = this.c;
        if (qniArr != null && qniArr.length > 0) {
            while (true) {
                qniArr = this.c;
                if (i2 >= qniArr.length) {
                    break;
                }
                riu riu2 = qniArr[i2];
                if (riu2 != null) {
                    a += rim.b(4, riu2);
                }
                i2++;
            }
        }
        return a;
    }
}
