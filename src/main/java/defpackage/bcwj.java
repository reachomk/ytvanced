package defpackage;

import java.util.List;

/* renamed from: bcwj */
public final class bcwj implements bcty {
    private final Iterable a;
    private final bcvs b;
    private final int c;

    public bcwj(Iterable iterable, bcvs bcvs) {
        int i = bdch.c;
        this.a = iterable;
        this.b = bcvs;
        this.c = i;
    }

    public final /* synthetic */ void a(Object obj) {
        bctz[] bctzArr;
        int length;
        bcup bcup = (bcup) obj;
        Iterable<bctz> iterable = this.a;
        int i = 0;
        if (iterable instanceof List) {
            List list = (List) iterable;
            bctzArr = (bctz[]) list.toArray(new bctz[list.size()]);
            length = bctzArr.length;
        } else {
            Object obj2 = new bctz[8];
            Object obj3 = obj2;
            length = 0;
            for (bctz bctz : iterable) {
                if (length == obj3.length) {
                    Object obj4 = new bctz[((length >> 2) + length)];
                    System.arraycopy(obj3, 0, obj4, 0, length);
                    obj3 = obj4;
                }
                int i2 = length + 1;
                obj3[length] = bctz;
                length = i2;
            }
            bctzArr = obj3;
        }
        if (length != 0) {
            bcuc bcwl = new bcwl(bcup, this.b, length, this.c);
            bcwi[] bcwiArr = bcwl.b;
            length = bcwiArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                bcwiArr[i3] = new bcwi(bcwl, i3);
            }
            bcwl.lazySet(0);
            bcwl.a.a((bcuo) bcwl);
            bcwl.a.a(bcwl);
            while (i < length && !bcwl.d) {
                bctz.a(bcwiArr[i], bctzArr[i]);
                i++;
            }
            return;
        }
        bcup.bM_();
    }
}
