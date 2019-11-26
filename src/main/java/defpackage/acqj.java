package defpackage;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EnableSuperchatSuccessScreenRendererOuterClass;

/* renamed from: acqj */
public final class acqj extends nf implements acqk, acqw, xfc {
    private acqr Z;
    public abax a;
    private axzb aa;
    private String ab = "SUPER_CHAT_CONTRACT_SCREEN";
    private final xto ac = new acqo(this, "SuperChatHostFragmentComponent");
    private nt b;
    private acqf c;

    private final acqq W() {
        return (acqq) this.ac.get();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        W().a(this);
        if (bundle != null) {
            nf nfVar;
            or a = this.b.a();
            if (this.b == null) {
                this.b = s();
            }
            this.c = (acqf) this.b.a(bundle, "BUNDLE_CONTRACT_FRAGMENT");
            this.Z = (acqr) this.b.a(bundle, "BUNDLE_SUCCESS_FRAGMENT");
            this.ab = bundle.getString("BUNDLE_CURRENT_FRAGMENT");
            if (!TextUtils.equals(this.ab, "SUPER_CHAT_CONTRACT_SCREEN")) {
                nfVar = this.c;
                if (nfVar != null) {
                    a.b(nfVar);
                }
            }
            if (!TextUtils.equals(this.ab, "SUPER_CHAT_SUCCESS_SCREEN")) {
                nfVar = this.Z;
                if (nfVar != null) {
                    a.b(nfVar);
                }
            }
            a.a();
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bundle = this.j;
        String str = "ARG_CONTRACT_RENDERER";
        if (bundle.containsKey(str)) {
            try {
                this.aa = (axzb) aobp.a(bundle, str, axzb.k, anxa.c());
            } catch (anyg e) {
                xtl.a("Failed to process bundle key ARG_CONTRACT_RENDERER", e);
            }
        }
        View inflate = layoutInflater.inflate(R.layout.lc_super_chat_contract_host_fragment, viewGroup, false);
        xpr.a(inflate);
        inflate.setBackgroundColor(-1);
        return inflate;
    }

    public final void B() {
        super.B();
        String str = "SUPER_CHAT_CONTRACT_SCREEN";
        if (TextUtils.equals(this.ab, str)) {
            anze anze = this.aa;
            if (anze != null) {
                if (this.c == null) {
                    acqf acqf = new acqf();
                    Bundle bundle = new Bundle();
                    aobp.a(bundle, "ARG_CONTRACT_RENDERER", anze);
                    acqf.f(bundle);
                    this.c = acqf;
                }
                a(this.c, str);
                return;
            }
            return;
        }
        str = "SUPER_CHAT_SUCCESS_SCREEN";
        if (TextUtils.equals(this.ab, str)) {
            a(this.Z, str);
        }
    }

    private final void a(nf nfVar, String str) {
        if (this.b == null) {
            this.b = s();
        }
        or a = this.b.a();
        nf a2 = this.b.a(this.ab);
        if (nfVar.equals(a2)) {
            a.c(nfVar);
            a.a();
            return;
        }
        if (a2 != null && a2.F_()) {
            a.b(a2);
        }
        if (!nfVar.F_()) {
            a.a(R.id.super_chat_contract_host_fragment, nfVar, str);
        }
        a.i = 4099;
        this.ab = str;
        a.a();
    }

    public final void e(Bundle bundle) {
        if (this.b == null) {
            this.b = s();
        }
        acqf acqf = this.c;
        if (acqf != null) {
            this.b.a(bundle, "BUNDLE_CONTRACT_FRAGMENT", acqf);
        }
        acqr acqr = this.Z;
        if (acqr != null) {
            this.b.a(bundle, "BUNDLE_SUCCESS_FRAGMENT", acqr);
        }
        bundle.putString("BUNDLE_CURRENT_FRAGMENT", this.ab);
    }

    public final void a(boolean z) {
        if (z) {
            new Builder(p()).setMessage(R.string.lc_super_chat_contract_confirm_exit).setPositiveButton(R.string.lc_super_chat_contract_confirm_exit_affirmative, new acqm(this)).setNegativeButton(R.string.lc_super_chat_contract_confirm_exit_negative, acql.a).show();
        } else {
            this.a.i();
        }
    }

    public final void a(asmu asmu) {
        anvf anvf;
        anxp anxp = asmu.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(EnableSuperchatSuccessScreenRendererOuterClass.enableSuperchatSuccessScreenRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = asmu.d;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(EnableSuperchatSuccessScreenRendererOuterClass.enableSuperchatSuccessScreenRenderer);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            anvf = (areg) b;
        } else {
            anvf = null;
        }
        if (this.Z == null) {
            acqr acqr = new acqr();
            Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_SUPER_CHAT_SUCCESS_RENDERER", anvf.toByteArray());
            acqr.f(bundle);
            this.Z = acqr;
        }
        a(this.Z, "SUPER_CHAT_SUCCESS_SCREEN");
    }

    public final void f() {
        this.a.i();
    }

    public final /* synthetic */ Object n() {
        return W();
    }
}
