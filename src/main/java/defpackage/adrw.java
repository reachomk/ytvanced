package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.youtube.R;

/* renamed from: adrw */
final class adrw extends Handler {
    public final /* synthetic */ adro a;

    public final void handleMessage(Message message) {
        int i = message.what;
        String str = "Couldn't obtain token for ";
        String valueOf;
        String str2;
        adro adro;
        adio a;
        adro adro2;
        if (i != 3) {
            boolean z = false;
            if (i != 4) {
                if (!(i != 5 || this.a.M() || this.a.N())) {
                    this.a.c(3);
                    valueOf = String.valueOf(this.a.x.bq_());
                    str2 = "Received gracefulReconnect from ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        str2.concat(valueOf);
                    }
                    adro = this.a;
                    adro.a(adro.i, false);
                    this.a.n.c();
                    valueOf = String.valueOf(this.a.x.bq_());
                    str2 = "Reconnecting to ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        str2.concat(valueOf);
                    }
                    adro = this.a;
                    a = adro.a(adro.x);
                    if (a != null && a.f()) {
                        adro2 = this.a;
                        adro2.a(a, adro2.z);
                        return;
                    }
                    valueOf = adro.e;
                    str2 = String.valueOf(this.a.x.bq_());
                    if (str2.length() == 0) {
                        str2 = new String(str);
                    } else {
                        str2 = str.concat(str2);
                    }
                    xtl.a(valueOf, str2);
                    this.a.b(10);
                }
                return;
            }
            if (!this.a.M()) {
                str2 = String.valueOf(this.a.x.bq_());
                String str3 = "Disconnecting from ";
                if (str2.length() == 0) {
                    str2 = new String(str3);
                } else {
                    str3.concat(str2);
                }
                boolean z2 = ((adrt) message.obj).a;
                if (z2 && !this.a.G()) {
                    adro2 = this.a;
                    if (adro2.w) {
                        xpr.a(this.a.i, adro2.i.getString(R.string.shared_queue_disconnect_toast), 1);
                    }
                }
                adro2 = this.a;
                adro2.a(adro2.i, z2);
                if (z2 && this.a.G()) {
                    z = true;
                }
                this.a.c(2);
                this.a.s.a("c_d");
                this.a.k.d(new adco());
                adro2 = this.a;
                if (adro2.v == 1 && adro2.C != null) {
                    adro2.C.post(new adrq(adro2));
                }
                if (this.a.y != null) {
                    ConditionVariable conditionVariable = new ConditionVariable();
                    xak.b();
                    this.a.j.post(new adrv(this, z, z2, conditionVariable));
                    conditionVariable.block();
                }
            }
        } else if (this.a.b()) {
            int e = this.a.n.e();
            if (e == 2 || e == 1) {
                this.a.n.a(true);
            }
            valueOf = String.valueOf(this.a.x.bq_());
            str2 = "Connecting to ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            adro = this.a;
            a = adro.a(adro.x);
            if (a != null && a.f()) {
                adro2 = this.a;
                adro2.a(a, adro2.z);
                return;
            }
            valueOf = adro.e;
            str2 = String.valueOf(this.a.x.bq_());
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            xtl.a(valueOf, str2);
            this.a.b(10);
        }
    }

    /* synthetic */ adrw(adro adro, Looper looper) {
        this.a = adro;
        super(looper);
    }
}
