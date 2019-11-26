package defpackage;

/* renamed from: lap */
public final class lap extends kzo {
    public lap(Object obj) {
        super(obj);
    }

    public final boolean f() {
        return true;
    }

    public final amuw a(amuw amuw) {
        amuv i = amuw.i();
        amxo amxo = (amxo) amuw.iterator();
        while (amxo.hasNext()) {
            ezu ezu = (ezu) amxo.next();
            if (!((ezu instanceof hdk) || (ezu instanceof fab))) {
                i.c(ezu);
            }
        }
        return i.a();
    }
}
