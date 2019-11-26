package defpackage;

import java.util.Map.Entry;

/* renamed from: suc */
final class suc implements bbnv {
    private final amur a;
    private final bdgv b;

    public final /* synthetic */ Object a(Object obj) {
        bdgv bdgv = (bdgv) aocf.cloneUsingSerialization(this.b);
        amxo amxo = (amxo) ((amuw) ((amur) obj).entrySet()).iterator();
        while (amxo.hasNext()) {
            Entry entry = (Entry) amxo.next();
            String str = (String) amqw.a((String) this.a.get(entry.getKey()));
            byte[] bArr = (byte[]) entry.getValue();
            bdgu a = stx.a(bdgv, str);
            if (a != null) {
                a.c.a(bArr);
            } else {
                bdgu[] bdguArr = bdgv.b;
                int length = bdguArr.length;
                bdgu[] bdguArr2 = new bdgu[(length + 1)];
                System.arraycopy(bdguArr, 0, bdguArr2, 0, length);
                a = new bdgu();
                a.b = str;
                a.c = new bdgx();
                a.c.a(bArr);
                bdguArr2[bdguArr2.length - 1] = a;
                bdgv.b = bdguArr2;
            }
        }
        return bdgv;
    }

    /* synthetic */ suc(amur amur, bdgv bdgv) {
        this.a = amur;
        this.b = bdgv;
    }
}
