package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdad */
public final class bdad implements bcun {
    public final /* synthetic */ bcvs a;
    private final /* synthetic */ bcuh[] b;

    public bdad(bcuh[] bcuhArr, bcvs bcvs) {
        this.b = bcuhArr;
        this.a = bcvs;
    }

    public final /* synthetic */ void a(Object obj) {
        bcum bcum = (bcum) obj;
        int length = this.b.length;
        if (length == 0) {
            bcum.a(new NoSuchElementException("Can't zip 0 Singles."));
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(length);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Object[] objArr = new Object[this.b.length];
        bcuo bdfu = new bdfu();
        bcum.a(bdfu);
        int i = 0;
        while (i < this.b.length && !bdfu.b && !atomicBoolean.get()) {
            bcum bdac = new bdac(this, objArr, i, atomicInteger, bcum, atomicBoolean);
            bdfu.a((bcuo) bdac);
            if (!bdfu.b && !atomicBoolean.get()) {
                this.b[i].a(bdac);
                i++;
            } else {
                return;
            }
        }
    }
}
