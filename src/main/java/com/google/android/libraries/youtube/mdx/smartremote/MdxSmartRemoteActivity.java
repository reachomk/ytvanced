package com.google.android.libraries.youtube.mdx.smartremote;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.snackbar.Snackbar;
import android.support.design.snackbar.SnackbarContentLayout;
import android.text.TextUtils;
import android.widget.Button;
import com.google.android.youtube.R;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.acwl;
import defpackage.adbt;
import defpackage.adbu;
import defpackage.adwk;
import defpackage.adwl;
import defpackage.adwm;
import defpackage.adwv;
import defpackage.adxe;
import defpackage.ahw;
import defpackage.alad;
import defpackage.alai;
import defpackage.alao;
import defpackage.alaq;
import defpackage.jl;
import defpackage.nf;
import defpackage.nt;
import defpackage.or;
import defpackage.xev;
import defpackage.xfc;
import defpackage.xse;

public final class MdxSmartRemoteActivity extends adbu implements alaq, xfc {
    private static final alad[] j = new alad[0];
    private static final alad[] k = new alad[]{new alad(2, acwc.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON, acwc.VOICE_SEARCH_DENY_MICROPHONE_BUTTON)};
    public SharedPreferences g;
    public acvx h;
    public boolean i;
    private adwk l;
    private nt m;
    private alao n;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        m().a(this);
        super.onCreate(bundle);
        this.i = getIntent().getBooleanExtra("com.google.android.libraries.youtube.mdx.smartremote.isOpenedFromMealbar", false);
        this.m = f();
        if (bundle != null) {
            this.n = (alao) this.m.a(bundle, "permission_request_fragment");
            if (this.n != null || !alao.a((Context) this, k)) {
                or a = this.m.a();
                a.b(this.n);
                a.a();
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1234) {
            nf a = f().a(16908290);
            if (a instanceof adxe) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    adwl adwl = ((adxe) a).a;
                    Snackbar a2 = Snackbar.a(adwl.g, R.string.mdx_smart_remote_no_microphone_detected_error_message);
                    adwv adwv = new adwv(adwl);
                    CharSequence text = a2.d.getText(R.string.mdx_smart_remote_navigate_to_settings_action_button_text);
                    Button button = ((SnackbarContentLayout) a2.e.getChildAt(0)).b;
                    if (TextUtils.isEmpty(text)) {
                        button.setVisibility(8);
                        button.setOnClickListener(null);
                        a2.j = false;
                    } else {
                        a2.j = true;
                        button.setVisibility(0);
                        button.setText(text);
                        button.setOnClickListener(new jl(a2, adwv));
                    }
                    a2.c();
                    adwl.f.b(acwc.MDX_SMART_REMOTE_VOICE_SEARCH_MIC_UNDETECTED_ERROR_TOAST, null);
                } else {
                    ((adxe) a).a.b();
                }
            }
        } else if (i == 65538 && (f().a(16908290) instanceof alao)) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (alai.a(this, this.g, new String[]{"android.permission.RECORD_AUDIO"})) {
                    this.h.a(3, new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_PERMA_DENY_MICROPHONE_BUTTON), null);
                } else {
                    this.h.a(3, new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_DENY_MICROPHONE_BUTTON), null);
                }
                finish();
                return;
            }
            this.h.a(3, new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_APPROVE_MICROPHONE_BUTTON), null);
            s_();
        }
    }

    public final void s_() {
        adbt.a(this, MdxSmartRemoteActivity.class, 0);
    }

    public final void W() {
        if (this.i) {
            adbt.a(this, MdxSmartRemoteActivity.class, 0);
        } else {
            finish();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int l() {
        return (this.i || !alao.a((Context) this, k)) ? 0 : 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final nf c(int i) {
        if (i == 0) {
            return new adxe();
        }
        if (i == 1) {
            this.h.b(new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_APPROVE_MICROPHONE_BUTTON));
            this.h.b(new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_DENY_MICROPHONE_BUTTON));
            this.h.b(new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_PERMA_DENY_MICROPHONE_BUTTON));
            alao a = alao.a(k, j, acwl.C, acwc.MDX_SMART_REMOTE_PERMISSIONS_ALLOW_ACCESS_BUTTON, acwc.MDX_SMART_REMOTE_PERMISSIONS_CANCEL_FLOW_BUTTON, acwc.MDX_SMART_REMOTE_PERMISSIONS_OPEN_APP_SETTINGS_DIALOG, R.string.mdx_smart_remote_permission_allow_access_description, R.string.mdx_smart_remote_permission_open_settings_description, R.string.mdx_smart_remote_permission_fragment_title);
            a.Z = new ahw((Context) this, (int) R.style.f272Mdx.Theme.SmartRemote);
            a.a = this;
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unknown current index ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, nf nfVar) {
        if (i != 0) {
            return i != 1 ? false : nfVar instanceof alao;
        } else {
            return nfVar instanceof adxe;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, Activity activity) {
        if (i == 0) {
            activity.setTitle(R.string.mdx_smart_remote_title);
        } else if (i == 1) {
            activity.setTitle(R.string.mdx_smart_remote_permission_fragment_title);
        } else {
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Unknown current index ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d(int i) {
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            adbt.a(this, MdxSmartRemoteActivity.class, 0);
            return true;
        }
        W();
        return true;
    }

    private final adwk m() {
        if (this.l == null) {
            this.l = ((adwm) xse.a(getApplication())).d(new xev(this));
        }
        return this.l;
    }

    public final /* synthetic */ Object n() {
        return m();
    }
}
