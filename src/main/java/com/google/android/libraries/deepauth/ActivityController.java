package com.google.android.libraries.deepauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.deepauth.accountcreation.AccountChooserActivity;
import com.google.android.libraries.deepauth.accountcreation.CreateAccountActivity;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbAccountChooserActivity;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbConsentActivity;
import com.google.android.libraries.deepauth.accountcreation.ui.BbbCreateAccountActivity;
import defpackage.aej;
import defpackage.ampq;
import defpackage.amqw;
import defpackage.ansb;
import defpackage.aodi;
import defpackage.sdz;
import defpackage.sea;
import defpackage.seb;
import defpackage.sec;
import defpackage.sed;
import defpackage.see;
import defpackage.sef;
import defpackage.seh;
import defpackage.seq;
import defpackage.ses;
import defpackage.sfd;
import defpackage.sfe;
import defpackage.sfg;
import defpackage.sfq;
import defpackage.sfv;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sgn;
import defpackage.sgz;
import defpackage.shn;
import defpackage.shr;
import defpackage.shz;
import defpackage.sij;
import defpackage.sik;
import defpackage.sim;
import defpackage.sjp;
import defpackage.sjq;
import java.util.List;

public class ActivityController extends aej implements sef, sik {
    private ses g;
    private sfe h;
    private sgn i;
    private sjp j;
    private seb k;
    private sij l;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        sgn c;
        super.onCreate(bundle);
        String str = "COMPLETION_STATE";
        if (bundle == null) {
            this.g = (ses) getIntent().getParcelableExtra(str);
            c = this.g.c();
        } else {
            this.g = (ses) bundle.getParcelable(str);
            c = sgn.a("INITIAL_STATE", bundle);
        }
        if (!sjq.a((Activity) this, this.g.a())) {
            this.h = new sfe(getApplication(), this.g.a(), sga.b.a());
            this.j = new sjp(this, this.h);
            if (k() != null) {
                sdz sdz = (sdz) k();
                this.k = sdz.a;
                this.l = sdz.b;
            }
            if (bundle != null) {
                this.i = c;
            } else if (this.g.a().c()) {
                a(sgn.APP_FLIP);
            } else {
                a(c);
            }
        }
    }

    private final void a(sgn sgn) {
        ses ses;
        Intent a;
        String str;
        switch (sgn.ordinal()) {
            case 0:
                b(sgn.TOKEN_REQUESTED);
                if (this.k == null) {
                    this.k = new seb();
                }
                seb seb = this.k;
                Context applicationContext = getApplicationContext();
                sgz a2 = this.g.a();
                if (seb.b == null) {
                    seb.b = new sec(a2);
                    seb.b.execute(new Context[]{applicationContext.getApplicationContext()});
                    seb.b.a.a(new sea(seb), sfv.a());
                    break;
                }
                break;
            case 1:
                b(sgn.ACCOUNT_CHOOSER);
                ses = this.g;
                if (seh.a(ses.a().a)) {
                    a = shn.a(this, ses);
                } else if (seh.a()) {
                    a = BbbAccountChooserActivity.a(this, ses);
                } else {
                    a = AccountChooserActivity.a(this, ses);
                }
                startActivityForResult(a, 100);
                return;
            case 2:
            case 3:
                b(sgn.CREATE_ACCOUNT);
                ses = this.g;
                if (seh.a(ses.a().a)) {
                    a = shz.a((Context) this, ses);
                } else {
                    str = "COMPLETION_STATE";
                    if (seh.a()) {
                        a = new Intent(this, BbbCreateAccountActivity.class).putExtra(str, ses);
                    } else {
                        a = new Intent(this, CreateAccountActivity.class).putExtra(str, ses);
                    }
                }
                startActivityForResult(a, 100);
                return;
            case 4:
                b(sgn.THIRD_PARTY_CONSENT);
                ses = this.g;
                if (seh.a(ses.a().a)) {
                    a = shr.a((Context) this, ses);
                } else if (seh.a()) {
                    a = BbbConsentActivity.a(this, ses);
                } else {
                    a = ConsentActivity.a(this, ses);
                }
                startActivityForResult(a, 100);
                return;
            case 5:
                b(sgn.APP_AUTH);
                sim.a(this, this.g.a());
                finish();
                return;
            case 6:
                if (this.k == null) {
                    this.k = new seb();
                }
                if (this.g.a().c()) {
                    b(sgn.APP_FLIP);
                    PackageManager packageManager = getPackageManager();
                    List<ansb> b = sfg.b();
                    String[] strArr = this.g.a().f;
                    str = sfg.c();
                    Intent intent = null;
                    if (!b.isEmpty()) {
                        for (ansb ansb : b) {
                            Intent intent2 = new Intent(ansb.d);
                            intent2.setPackage(ansb.b);
                            if (packageManager.resolveActivity(intent2, 65536) != null) {
                                String a3 = sjq.a(packageManager, ansb.b);
                                if (a3 != null && ampq.a(a3, ansb.c)) {
                                    intent2.putExtra("CLIENT_ID", str);
                                    intent2.putExtra("SCOPE", strArr);
                                    intent2.putExtra("REDIRECT_URI", ansb.e);
                                    intent = intent2;
                                }
                            }
                        }
                    }
                    if (intent != null) {
                        this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_3P_APP_SUPPORTED);
                        startActivityForResult(intent, 300);
                        return;
                    }
                    if (!sfg.b().isEmpty()) {
                        this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED);
                    }
                    a(this.g.c());
                    return;
                }
                a(this.g.c());
                return;
            default:
                Log.e("ActivityController", "Unknown UiState in activity controller");
                finish();
                break;
        }
    }

    private final void b(sgn sgn) {
        sgn sgn2 = this.i;
        sfz a = sfz.a(sgn2 != null ? sgn2.h : 3);
        this.i = sgn;
        this.h.a(a, l());
    }

    private final sfz l() {
        amqw.a(this.i);
        return sfz.a(this.i.h);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        sgn sgn = this.i;
        if (sgn != null) {
            bundle.putInt("INITIAL_STATE", sgn.ordinal());
        }
        bundle.putParcelable("COMPLETION_STATE", this.g);
        super.onSaveInstanceState(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        seb seb = this.k;
        if (seb != null) {
            seb.a(this);
        }
        sij sij = this.l;
        if (sij != null) {
            sij.a((sik) this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        seb seb = this.k;
        if (seb != null) {
            seb.a(null);
        }
        sij sij = this.l;
        if (sij != null) {
            sij.a(null);
        }
        super.onStop();
    }

    public final Object x_() {
        return new sdz(this.k, this.l);
    }

    public final void a(sfq sfq) {
        d(sfq);
    }

    public final void b(sfq sfq) {
        if (sfq.a()) {
            String valueOf = String.valueOf(sfq.b);
            String str = "Error encountered while saving token: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.e("ActivityController", valueOf);
            d(new sfq(101, new IllegalStateException("Aborting without state information.")));
            return;
        }
        d(sfq);
    }

    public final void c(sfq sfq) {
        d(sfq);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 200) {
            if (i == 300) {
                String stringExtra;
                if (i2 == -1) {
                    this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_FLOW_SUCCESS);
                    seb seb = this.k;
                    sgz a = this.g.a();
                    stringExtra = intent.getStringExtra("AUTHORIZATION_CODE");
                    if (seb.e == null) {
                        seb.e = new see(a, stringExtra, 3);
                        seb.e.execute(new Context[]{getApplicationContext()});
                        seb.e.a.a(new sed(seb), sfv.a());
                    }
                } else if (i2 != 0) {
                    i2 = intent.getIntExtra("ERROR_TYPE", 1);
                    int intExtra = intent.getIntExtra("ERROR_CODE", -1);
                    stringExtra = intent.getStringExtra("ERROR_DESCRIPTION");
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(stringExtra)) {
                        stringExtra = "n/a";
                    }
                    objArr[0] = stringExtra;
                    stringExtra = String.format("description: %s", objArr);
                    String str = "ActivityController";
                    if (i2 == 1) {
                        this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                        Log.e(str, String.format("App Flip Error: recoverable, error code: %d, %s", new Object[]{Integer.valueOf(intExtra), stringExtra}));
                        a(this.g.c());
                    } else if (i2 == 3) {
                        this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                        Log.e(str, String.format("App Flip Error: Invalid request or parameters, error code: %d, %s", new Object[]{Integer.valueOf(intExtra), stringExtra}));
                        a(this.g.c());
                        return;
                    } else if (i2 == 2) {
                        if (intExtra == 13) {
                            this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_3P_CONSENT_REJECTED);
                        } else {
                            this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE);
                        }
                        Log.e(str, String.format("App Flip Error: Unrecoverable, error code: %d, %s", new Object[]{Integer.valueOf(intExtra), stringExtra}));
                        m();
                        finish();
                        return;
                    }
                } else {
                    this.h.a(sfz.a(14), aodi.EVENT_APP_FLIP_FLOW_CANCELED);
                    a(this.g.c());
                    return;
                }
                return;
            }
        } else if (i2 != -1) {
            new sfe(getApplication(), this.g.a(), sga.b.a()).a(sfz.a(7), aodi.EVENT_APP_AUTH_DISMISS);
        } else {
            if (this.l == null) {
                this.l = new sij(getApplication(), this.g.a());
            }
            this.l.a((sik) this);
            this.l.a(intent);
            return;
        }
        sfq sfq;
        if (i2 == 0) {
            m();
            finish();
        } else if (i2 != 4000) {
            String str2 = "TOKEN_RESPONSE";
            if (i2 == 6000) {
                if (intent == null) {
                    sfq = new sfq(101, new IllegalStateException("Aborting without state information."));
                } else {
                    sfq = (sfq) intent.getParcelableExtra(str2);
                }
                this.j.a(this, sfz.a(this.i.h), 6000, sfq, this.g.a());
                finish();
            } else if (i2 == 8000) {
                d((sfq) intent.getParcelableExtra(str2));
            } else {
                StringBuilder stringBuilder = new StringBuilder(53);
                stringBuilder.append("Unexpected result code from leaf activity ");
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else {
            seq seq = new seq(this.g);
            if (seq.a.c().ordinal() != 2) {
                sfq = new sfq(1, null, new sfd());
            } else {
                sfq = new sfq(seq.a.a(sgn.ACCOUNT_CHOOSER));
            }
            d(sfq);
        }
    }

    private final void d(sfq sfq) {
        amqw.a((Object) sfq);
        amqw.b(this.i != null);
        if (sfq.b()) {
            ses ses = sfq.a;
            if (ses != null) {
                ses.a().k = this.g.a().k;
                this.g = ses;
                a(this.g.c());
                return;
            }
            this.j.a(this, l(), this.g.a(), new IllegalStateException("Couldn't get CompletionState for incomplete TokenResponse"));
            finish();
            return;
        }
        this.j.a(this, l(), -1, sfq, this.g.a());
        finish();
    }

    private final void m() {
        sfq sfq = new sfq(1, new sfd());
        this.j.a(this, l(), 0, sfq, this.g.a());
    }
}
