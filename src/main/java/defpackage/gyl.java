package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ManageMembershipRendererOuterClass;
import com.google.protos.youtube.api.innertube.ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint;
import com.google.protos.youtube.api.innertube.ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* renamed from: gyl */
public final class gyl extends nd implements kny, wmw {
    public Activity Z;
    private TextView aA;
    private wtc aB;
    private xsu aC;
    private String aD = null;
    public aaas aa;
    public afpu ab;
    public afqe ac;
    public acwa ad;
    public ablj ae;
    public xoi af;
    public bcaa ag;
    public wnq ah;
    public wnh ai;
    public woi aj;
    public wqp ak;
    public woq al;
    public gza am;
    public akpe an;
    public emd ao;
    public wmp ap;
    public String aq;
    public EditText ar;
    public AlertDialog as;
    public akpk at;
    private apxu au;
    private TextView av;
    private View aw;
    private RecyclerView ax;
    private View ay;
    private AlertDialog az;

    public final void a(Activity activity) {
        super.a(activity);
        this.Z = activity;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((gzb) xse.a(this.Z)).a(this);
        a(1, 0);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            bundle = this.j;
        }
        this.au = aaax.a(bundle.getByteArray("navigation_endpoint"));
        this.aC = this.ak.a(new gyx(this));
        View inflate = layoutInflater.inflate(R.layout.ypc_offers_list_item, viewGroup, false);
        this.ax = (RecyclerView) inflate.findViewById(R.id.offers);
        this.ax.a(new ans());
        this.av = (TextView) inflate.findViewById(R.id.title);
        this.aw = inflate.findViewById(R.id.separator);
        this.ay = inflate.findViewById(R.id.progress);
        a(null);
        return inflate;
    }

    public final void W_() {
        super.W_();
        this.aD = this.ao.b();
        if (this.ab.a()) {
            W();
            return;
        }
        this.c.hide();
        this.ac.a(this.Z, null, new gyw(this));
    }

    /* Access modifiers changed, original: final */
    public final void W() {
        if (this.au == null) {
            xtl.c("No navigation endpoint provided.");
            dismiss();
        }
        apxu apxu = this.au;
        anxr access$000 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            b(null);
            return;
        }
        apxu = this.au;
        access$000 = anxl.checkIsLite(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint);
        apxu.a(access$000);
        Object b;
        if (apxu.h.a(access$000.d)) {
            apxu = this.au;
            access$000 = anxl.checkIsLite(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint managePurchaseEndpointOuterClass$ManagePurchaseEndpoint = (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint) b;
            aumq aumq = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b;
            if (aumq == null) {
                aumq = aumq.c;
            }
            aumq aumq2;
            if (aumq.a != 173521720) {
                aumo aumo;
                aumq2 = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b;
                if (aumq2 == null) {
                    aumq2 = aumq.c;
                }
                if (aumq2.a == 95592495) {
                    aumo = (aumo) aumq2.b;
                } else {
                    aumo = aumo.p;
                }
                a(aumo);
                return;
            }
            aumq2 = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b;
            if (aumq2 == null) {
                aumq2 = aumq.c;
            }
            if (aumq2.a == 173521720) {
                b = (axsa) aumq2.b;
            } else {
                b = axsa.j;
            }
            X();
            Y();
            a((CharSequence) "");
            this.at.add(b);
            return;
        }
        apxu = this.au;
        access$000 = anxl.checkIsLite(ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand.manageSponsorshipCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            aa();
            ablj ablj = this.ae;
            aaml ably = new ably(ablj.c, ablj.d.c());
            apxu = this.au;
            anxr access$0002 = anxl.checkIsLite(ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand.manageSponsorshipCommand);
            apxu.a(access$0002);
            b = apxu.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            b = (ManageSponsorshipCommandOuterClass$ManageSponsorshipCommand) b;
            amqw.a(b);
            ably.a = aali.b(b.b);
            ably.a(foe.a(this.au));
            ablj = this.ae;
            ablj.m.a(ably, new gyy(this));
            return;
        }
        String valueOf = String.valueOf(this.au);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 38);
        stringBuilder.append("Unknown navigation endpoint provided: ");
        stringBuilder.append(valueOf);
        xtl.c(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final void b(String str) {
        aa();
        apxu apxu = this.au;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                abmf c = this.ae.c();
                apxu apxu2 = this.au;
                anxr access$0002 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
                apxu2.a(access$0002);
                Object b = apxu2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                c.a((YpcOffersEndpoint$YPCOffersEndpoint) b);
                c.a(foe.a(this.au));
                if (!TextUtils.isEmpty(str)) {
                    c.a = aali.b(str);
                }
                this.aq = str;
                this.ae.a(c, new gyz(this));
                return;
            }
        }
        xtl.c("Invalid navigation endpoint provided.");
        dismiss();
    }

    public final void a(azns azns) {
        X();
        this.at.addAll(wot.a(azns));
        aznq aznq = azns.f;
        if (aznq == null) {
            aznq = aznq.c;
        }
        CharSequence charSequence = null;
        azna azna;
        if ((aznq.a & 1) != 0) {
            aznq = azns.f;
            if (aznq == null) {
                aznq = aznq.c;
            }
            azna = aznq.b;
            if (azna == null) {
                azna = azna.e;
            }
        } else {
            azna = null;
        }
        arml arml = azns.e;
        if (arml == null) {
            arml = arml.f;
        }
        if (!(TextUtils.isEmpty(ajqy.a(arml)) || azna == null)) {
            this.at.add(azns);
        }
        if (azns.g.size() > 0 || azns.i.size() > 0) {
            CharSequence charSequence2;
            akpk akpk = this.at;
            CharSequence[] a = wot.a(azns.g, this.aa);
            CharSequence[] a2 = wot.a(azns.i, this.aa);
            r6 = new CharSequence[2];
            String str = "line.separator";
            r6[0] = System.getProperty(str);
            r6[1] = System.getProperty(str);
            CharSequence concat = TextUtils.concat(r6);
            if (a != null) {
                charSequence2 = null;
                for (CharSequence charSequence3 : a) {
                    if (TextUtils.isEmpty(charSequence2)) {
                        charSequence2 = charSequence3;
                    } else {
                        charSequence2 = TextUtils.concat(new CharSequence[]{charSequence2, concat, charSequence3});
                    }
                }
                charSequence = charSequence2;
            }
            if (a2 != null) {
                charSequence2 = charSequence;
                for (CharSequence charSequence32 : a2) {
                    if (TextUtils.isEmpty(charSequence2)) {
                        charSequence2 = charSequence32;
                    } else {
                        charSequence2 = TextUtils.concat(new CharSequence[]{charSequence2, concat, charSequence32});
                    }
                }
            } else {
                charSequence2 = charSequence;
            }
            akpk.add(new kck(charSequence, charSequence2));
        }
        Y();
        arml arml2 = azns.b;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        a(ajqy.a(arml2));
    }

    /* Access modifiers changed, original: final */
    public final void a(aswd aswd) {
        anxp anxp = aswd.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ManageMembershipRendererOuterClass.manageMembershipRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = aswd.c;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(ManageMembershipRendererOuterClass.manageMembershipRenderer);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            a((aumo) b);
            return;
        }
        xtl.c("No manage membership renderer");
        dismiss();
    }

    private final void a(aumo aumo) {
        X();
        Y();
        a((CharSequence) "");
        this.at.add(aumo);
    }

    /* Access modifiers changed, original: final */
    public final void X() {
        if (this.at == null) {
            aknw aknw = new aknw();
            aknw.a(aznm.class, new akpa(this.ag));
            aknw.a(auus.class, new gyk(this));
            aknw.a(aumo.class, new gyn(this));
            aknw.a(axsa.class, new gyp(this));
            aknw.a(ayjh.class, new gyo(this));
            aknw.a(azns.class, new knz(this.Z, this));
            aknw.a(kck.class, new kcl(this.Z));
            apa a = this.an.a(aknw);
            aknh akpk = new akpk();
            a.a(akpk);
            a.a(new akod(this.ad.t()));
            this.ax.a(a);
            this.at = akpk;
        }
        this.at.clear();
    }

    public final void a(azna azna) {
        if (this.az == null) {
            View inflate = View.inflate(this.Z, R.layout.ypc_offers_coupon_entry_dialog, null);
            this.aA = (TextView) inflate.findViewById(R.id.prompt);
            this.ar = (EditText) inflate.findViewById(R.id.coupon_entry);
            Builder builder = new Builder(this.Z);
            arml arml = azna.b;
            if (arml == null) {
                arml = arml.f;
            }
            this.az = builder.setTitle(ajqy.a(arml)).setView(inflate).setPositiveButton(R.string.done, new gyr(this)).create();
            this.az.getWindow().setSoftInputMode(5);
        }
        TextView textView = this.aA;
        arml arml2 = azna.c;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        textView.setText(ajqy.a(arml2));
        EditText editText = this.ar;
        arml arml3 = azna.d;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        editText.setHint(ajqy.a(arml3));
        this.az.show();
    }

    public final void c(String str) {
        b(str);
    }

    /* Access modifiers changed, original: final */
    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.av.setVisibility(8);
            this.aw.setVisibility(8);
            return;
        }
        this.aw.setVisibility(0);
        this.av.setVisibility(0);
        this.av.setText(charSequence);
    }

    private final void aa() {
        this.ay.setVisibility(0);
        this.ax.setVisibility(4);
        this.ax.setClickable(false);
    }

    /* Access modifiers changed, original: final */
    public final void Y() {
        this.ay.setVisibility(8);
        this.ax.setVisibility(0);
        this.ax.setClickable(true);
    }

    public final wtc Z() {
        if (this.aB == null) {
            this.aB = new wtc(this.Z, this.af);
        }
        return this.aB;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.am.a(this);
        this.aC.c();
        amxo amxo = (amxo) amuw.a(this.ap.a).iterator();
        while (amxo.hasNext()) {
            ((OnDismissListener) amxo.next()).onDismiss(dialogInterface);
        }
    }

    public final void N_() {
        super.N_();
        this.ao.a(this.aD);
    }
}
