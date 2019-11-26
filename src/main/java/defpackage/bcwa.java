package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bcwa */
public final class bcwa extends AtomicBoolean implements bcty {
    public static final long serialVersionUID = -2817751667698696782L;
    private final bcvy a;

    public bcwa(bcvy bcvy) {
        this.a = bcvy;
    }

    public final /* synthetic */ void a(Object obj) {
        bcup bcup = (bcup) obj;
        bcuc bcwd = new bcwd(bcup, this.a);
        bcvy bcvy = this.a;
        synchronized (bcvy.b) {
            bcwd[] bcwdArr = bcvy.c;
            int length = bcwdArr.length;
            bcwd[] bcwdArr2 = new bcwd[(length + 1)];
            System.arraycopy(bcwdArr, 0, bcwdArr2, 0, length);
            bcwdArr2[length] = bcwd;
            bcvy.c = bcwdArr2;
        }
        bcup.a((bcuo) bcwd);
        bcup.a(bcwd);
        if (!get() && compareAndSet(false, true)) {
            bcvy bcvy2 = this.a;
            bcup bcwb = new bcwb(bcvy2);
            bcvy2.b.a(bcwb);
            bcvy2.a.a(bcwb);
            bcvy2.e = true;
        }
    }
}
