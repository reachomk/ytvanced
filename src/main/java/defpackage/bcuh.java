package defpackage;

/* renamed from: bcuh */
public class bcuh {
    private final bcun a;

    protected bcuh(bcun bcun) {
        bcvq bcvq = bdeh.b;
        if (bcvq != null) {
            bcun = (bcun) bcvq.a(bcun);
        }
        this.a = bcun;
    }

    public static bcuh a(bcun bcun) {
        return new bcuh(bcun);
    }

    public static bctz a(bcuh bcuh) {
        return bctz.a(new bdaf(bcuh.a));
    }

    public final bcuh a() {
        return new bcvz(new bcwa(new bcvy(bcuh.a(this)))).b();
    }

    public final bcuh a(bcvq bcvq) {
        return bcuh.a(new bdab(this, bcvq));
    }

    public final bcuh a(bcuf bcuf) {
        if (this instanceof bdcl) {
            return ((bdcl) this).b(bcuf);
        }
        if (bcuf != null) {
            return bcuh.a(new bczz(this.a, bcuf));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final bcuo a(bcvk bcvk, bcvk bcvk2) {
        if (bcvk == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        } else if (bcvk2 != null) {
            return a(new bcug(bcvk2, bcvk));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    public final bcuo a(bcum bcum) {
        try {
            bcuo bcum2;
            bcun bcun = this.a;
            bcvt bcvt = bdeh.c;
            if (bcvt != null) {
                bcun = (bcun) bcvt.a(this, bcun);
            }
            bcun.a(bcum2);
            bcvq bcvq = bdeh.d;
            if (bcvq != null) {
                bcum2 = (bcuo) bcvq.a(bcum2);
            }
            return bcum2;
        } catch (Throwable th) {
            bcva.b(th);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error occurred attempting to subscribe [");
            stringBuilder.append(th.getMessage());
            stringBuilder.append("] and then again while trying to pass to onError.");
            bdeh.c(new RuntimeException(stringBuilder.toString(), th));
        }
    }
}
