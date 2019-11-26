package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* renamed from: ban */
public class ban {
    public final Context a;
    public final bav b;
    public final baw c;
    public baq d;
    public bao e;
    public boolean f;
    public bax g;
    public boolean h;

    public ban(Context context) {
        this(context, null);
    }

    public bay a(String str) {
        throw null;
    }

    public void b(bao bao) {
    }

    ban(Context context, bav bav) {
        this.c = new baw(this);
        if (context != null) {
            this.a = context;
            if (bav == null) {
                this.b = new bav(new ComponentName(context, getClass()));
                return;
            } else {
                this.b = bav;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public final void a(baq baq) {
        bbb.e();
        this.d = baq;
    }

    public final void a(bao bao) {
        bbb.e();
        if (!Objects.equals(this.e, bao)) {
            this.e = bao;
            if (!this.f) {
                this.f = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }

    public final void a(bax bax) {
        bbb.e();
        if (this.g != bax) {
            this.g = bax;
            if (!this.h) {
                this.h = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public bay a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return a(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public bap b(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
}
