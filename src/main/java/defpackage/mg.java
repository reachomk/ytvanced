package defpackage;

/* renamed from: mg */
class mg extends md {
    public sg[] m = null;
    public String n;
    public int o = 0;
    public int p;

    public mg() {
        super();
    }

    public boolean b() {
        return false;
    }

    public mg(mg mgVar) {
        super();
        this.n = mgVar.n;
        this.p = mgVar.p;
        this.m = se.a(mgVar.m);
    }

    public String getPathName() {
        return this.n;
    }

    public sg[] getPathData() {
        return this.m;
    }

    public void setPathData(sg[] sgVarArr) {
        if (se.a(this.m, sgVarArr)) {
            sg[] sgVarArr2 = this.m;
            for (int i = 0; i < sgVarArr.length; i++) {
                sgVarArr2[i].a = sgVarArr[i].a;
                int i2 = 0;
                while (true) {
                    float[] fArr = sgVarArr[i].b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    sgVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
            return;
        }
        this.m = se.a(sgVarArr);
    }
}
