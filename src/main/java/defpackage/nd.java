package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: nd */
public class nd extends nf implements OnCancelListener, OnDismissListener {
    private Handler Z;
    public int a = 0;
    private final Runnable aa = new nc(this);
    private int ab = 0;
    private boolean ac = true;
    private int ad = -1;
    private boolean ae;
    private boolean af;
    private boolean ag;
    public boolean b = true;
    public Dialog c;

    public void onCancel(DialogInterface dialogInterface) {
    }

    public final void a(int i, int i2) {
        this.ab = i;
        if (i == 2) {
            this.a = 16973913;
        }
        if (i2 != 0) {
            this.a = i2;
        }
    }

    public void a(nt ntVar, String str) {
        this.af = false;
        this.ag = true;
        or a = ntVar.a();
        a.a((nf) this, str);
        a.a();
    }

    public final int a(or orVar, String str) {
        this.af = false;
        this.ag = true;
        orVar.a((nf) this, str);
        this.ae = false;
        int a = orVar.a();
        this.ad = a;
        return a;
    }

    public void dismiss() {
        a(false, false);
    }

    public final void f() {
        a(true, false);
    }

    private final void a(boolean z, boolean z2) {
        if (!this.af) {
            this.af = true;
            this.ag = false;
            Dialog dialog = this.c;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.c.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.Z.getLooper()) {
                        onDismiss(this.c);
                    } else {
                        this.Z.post(this.aa);
                    }
                }
            }
            this.ae = true;
            if (this.ad >= 0) {
                r().b(this.ad);
                this.ad = -1;
                return;
            }
            or a = r().a();
            a.a(this);
            if (z) {
                a.b();
                return;
            }
            a.a();
        }
    }

    public final void i_(boolean z) {
        this.ac = z;
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void a(Context context) {
        super.a(context);
        if (!this.ag) {
            this.af = false;
        }
    }

    public void J_() {
        super.J_();
        if (!this.ag && !this.af) {
            this.af = true;
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        this.Z = new Handler();
        this.b = this.A == 0;
        if (bundle != null) {
            this.ab = bundle.getInt("android:style", 0);
            this.a = bundle.getInt("android:theme", 0);
            this.ac = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.ad = bundle.getInt("android:backStackId", -1);
        }
    }

    public final LayoutInflater c(Bundle bundle) {
        if (!this.b) {
            return h(bundle);
        }
        this.c = a(bundle);
        Dialog dialog = this.c;
        String str = "layout_inflater";
        if (dialog == null) {
            return (LayoutInflater) this.w.b.getSystemService(str);
        }
        a(dialog, this.ab);
        return (LayoutInflater) this.c.getContext().getSystemService(str);
    }

    public void a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog a(Bundle bundle) {
        return new Dialog(V_(), this.a);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ae) {
            a(true, true);
        }
    }

    public void d(Bundle bundle) {
        super.d(bundle);
        if (this.b) {
            View z = z();
            if (z != null) {
                if (z.getParent() == null) {
                    this.c.setContentView(z);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            nn p = p();
            if (p != null) {
                this.c.setOwnerActivity(p);
            }
            this.c.setCancelable(this.ac);
            this.c.setOnCancelListener(this);
            this.c.setOnDismissListener(this);
            if (bundle != null) {
                bundle = bundle.getBundle("android:savedDialogState");
                if (bundle != null) {
                    this.c.onRestoreInstanceState(bundle);
                }
            }
        }
    }

    public void W_() {
        super.W_();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ae = false;
            dialog.show();
        }
    }

    public void e(Bundle bundle) {
        Dialog dialog = this.c;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        int i = this.ab;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        i = this.a;
        if (i != 0) {
            bundle.putInt("android:theme", i);
        }
        if (!this.ac) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        i = this.ad;
        if (i != -1) {
            bundle.putInt("android:backStackId", i);
        }
    }

    public void N_() {
        super.N_();
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void i() {
        super.i();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ae = true;
            dialog.setOnDismissListener(null);
            this.c.dismiss();
            if (!this.af) {
                onDismiss(this.c);
            }
            this.c = null;
        }
    }
}
