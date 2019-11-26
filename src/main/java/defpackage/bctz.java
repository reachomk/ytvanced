package defpackage;

import java.util.Arrays;

/* renamed from: bctz */
public class bctz {
    private final bcty a;

    protected bctz(bcty bcty) {
        this.a = bcty;
    }

    public static bctz a(bcty bcty) {
        bcvq bcvq = bdeh.a;
        if (bcvq != null) {
            bcty = (bcty) bcvq.a(bcty);
        }
        return new bctz(bcty);
    }

    public final bctz a(bcub bcub) {
        return bctz.a(new bcwy(this.a, bcub));
    }

    public final bctz a(bcua bcua) {
        return (bctz) bcua.a(this);
    }

    public final bcuh b() {
        return new bcuh(new bcxd(this));
    }

    public static bctz a(bctz bctz, bctz bctz2, bcvt bcvt) {
        return bctz.a(new bcwj(Arrays.asList(new bctz[]{bctz, bctz2}), new bcvv(bcvt)));
    }

    public static bctz a(Iterable iterable) {
        return bctz.a(new bcww(iterable));
    }

    public static bctz a(bctz bctz) {
        if (bctz.getClass() == bdci.class) {
            return bdci.h();
        }
        return bctz.a(bcyb.a);
    }

    public static bctz a(bctz bctz, bctz bctz2) {
        return bctz.a(new bctz[]{bctz, bctz2});
    }

    public static bctz a(bctz[] bctzArr) {
        return bctz.a(bctz.a(new bcwu(bctzArr)));
    }

    public final bctz c() {
        return a(bcxw.a);
    }

    public final bctz a(bcvq bcvq) {
        return bctz.a(new bcws(this, bcvq));
    }

    public final bctz d() {
        return a(new bczk()).g();
    }

    public final bctz b(bcvq bcvq) {
        return bctz.a(new bcxb(this, bcvq));
    }

    public final bctz a(bcuf bcuf) {
        int i = bdch.c;
        if (this instanceof bdci) {
            return bdci.a();
        }
        return a(new bcyf(bcuf, i));
    }

    public final bctz e() {
        return a(bcyi.a);
    }

    public final bctz f() {
        return a(bcyk.a);
    }

    public final bctz g() {
        return a(bcyv.a);
    }

    public final bcuo a(bcvk bcvk) {
        if (bcvk != null) {
            return bctz.a(new bdbt(bcvk, bdbu.a, bcvn.a), this);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final bcuo a(bcvk bcvk, bcvk bcvk2) {
        if (bcvk2 != null) {
            return bctz.a(new bdbt(bcvk, bcvk2, bcvn.a), this);
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public final bcuo a(bcud bcud) {
        if (bcud instanceof bcup) {
            return bctz.a((bcup) bcud, this);
        }
        if (bcud != null) {
            return bctz.a(new bdcf(bcud), this);
        }
        throw new NullPointerException("observer is null");
    }

    public final bcuo a(bcup bcup) {
        try {
            bcup.d();
            bdeh.a(this, this.a).a(bcup);
            bcup = bdeh.a((bcuo) bcup);
            return bcup;
        } catch (Throwable th) {
            bcva.b(th);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error occurred attempting to subscribe [");
            stringBuilder.append(th.getMessage());
            stringBuilder.append("] and then again while trying to pass to onError.");
            bdeh.b(new bcvf(stringBuilder.toString(), th));
        }
    }

    public static bcuo a(bcup bcup, bctz bctz) {
        if (bcup == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (bctz.a != null) {
            bcup.d();
            if (!(bcup instanceof bddy)) {
                bcup = new bddy(bcup);
            }
            try {
                bdeh.a(bctz, bctz.a).a(bcup);
                bcup = bdeh.a((bcuo) bcup);
                return bcup;
            } catch (Throwable th) {
                bcva.b(th);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error occurred attempting to subscribe [");
                stringBuilder.append(th.getMessage());
                stringBuilder.append("] and then again while trying to pass to onError.");
                bdeh.b(new bcvf(stringBuilder.toString(), th));
            }
        } else {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
    }

    public final bctz b(bcuf bcuf) {
        int i = (this.a instanceof bcwk) ^ 1;
        if (this instanceof bdci) {
            return bdci.a();
        }
        return bctz.a(new bcza(this, bcuf, i));
    }

    public final bctz c(bcvq bcvq) {
        return b(bcvq).a(bczh.a);
    }
}
