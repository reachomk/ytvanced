package defpackage;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;

/* renamed from: atq */
public class atq extends qu implements af, atz, ben, bi {
    private final beo a;
    private bf b;
    private int c;
    public final ai e;
    public final atv f;

    public atq() {
        this.e = new ai(this);
        this.a = beo.a((ben) this);
        this.f = new atv(new atp(this));
        ai aiVar = this.e;
        if (aiVar != null) {
            aiVar.a(new ats(this));
            this.e.a(new atr(this));
            if (VERSION.SDK_INT <= 23) {
                this.e.a(new att(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Deprecated
    public Object x_() {
        return null;
    }

    public atq(int i) {
        this();
        this.c = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(bundle);
        ay.a((Activity) this);
        int i = this.c;
        if (i != 0) {
            setContentView(i);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        ai aiVar = this.e;
        if (aiVar instanceof ai) {
            aiVar.a(z.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.a.b(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        atu atu;
        Object x_ = x_();
        bf bfVar = this.b;
        if (bfVar == null) {
            atu = (atu) getLastNonConfigurationInstance();
            if (atu != null) {
                bfVar = atu.b;
            }
        }
        if (bfVar == null && x_ == null) {
            return null;
        }
        atu = new atu();
        atu.a = x_;
        atu.b = bfVar;
        return atu;
    }

    @Deprecated
    public final Object k() {
        atu atu = (atu) getLastNonConfigurationInstance();
        return atu != null ? atu.a : null;
    }

    public final x y_() {
        return this.e;
    }

    public final bf R_() {
        if (getApplication() != null) {
            if (this.b == null) {
                atu atu = (atu) getLastNonConfigurationInstance();
                if (atu != null) {
                    this.b = atu.b;
                }
                if (this.b == null) {
                    this.b = new bf();
                }
            }
            return this.b;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f.a();
    }

    public final atv z_() {
        return this.f;
    }

    public final bek S_() {
        return this.a.a;
    }
}
