package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PhonebookEndpointOuterClass$PhonebookEndpoint;
import java.util.concurrent.TimeUnit;

/* renamed from: aljs */
public final class aljs extends alir implements alga, alnp, OnClickListener, xcp {
    private static final long aq = TimeUnit.SECONDS.toMillis(10);
    public aarh Z;
    public akkq aa;
    public aaas ab;
    public alpa ac;
    public SharedPreferences ad;
    public acvx af;
    public xci ag;
    public alfy ah;
    public allw ai;
    public akpe aj;
    public xsc ak;
    public xwb al;
    public EditText am;
    public ImageView an;
    public TextView ao;
    public allf ap;
    private apxu ar;
    private akoh as;
    private Toolbar at;
    private View au;
    private View av;
    private Snackbar aw;
    private boolean ax;
    private boolean ay;
    private alfz az;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return R.layout.phonebook;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((aljy) xse.a(p())).a(this);
        a(2, this.al.a);
        bundle = this.j;
        if (bundle != null) {
            String str = "phonebook_endpoint";
            if (bundle.containsKey(str)) {
                try {
                    this.ar = (apxu) aobp.a(bundle, str, apxu.d, anxa.c());
                } catch (anyg unused) {
                }
            }
        }
        this.ag.a((Object) this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.a(layoutInflater, viewGroup, bundle);
        this.at = (Toolbar) a.findViewById(R.id.toolbar);
        this.am = (EditText) a.findViewById(R.id.edit_text);
        this.an = (ImageView) a.findViewById(R.id.cancel_search);
        this.ao = (TextView) a.findViewById(R.id.no_results_text);
        this.aw = (Snackbar) a.findViewById(R.id.snackbar);
        RecyclerView recyclerView = (RecyclerView) a.findViewById(R.id.list);
        this.au = a.findViewById(R.id.phonebook_contents);
        this.av = a.findViewById(R.id.empty_contents);
        this.ap = new allf(this.ad);
        this.at.a((OnClickListener) this);
        this.at.c((int) R.string.accessibility_back);
        this.am.addTextChangedListener(new aljv(this));
        this.an.setOnClickListener(new alju(this));
        aknw aknw = new aknw();
        aknw.a(alld.class, new alnj(p(), this.ab, this.aa, this.ac, this.ap, (alni) this.ae));
        aknw.a(avzc.class, new alnk(p()));
        recyclerView.a(new ans());
        this.as = new akoh();
        apa a2 = this.aj.a(aknw);
        a2.a(this.as);
        recyclerView.a(a2);
        this.as.b(new aljx(recyclerView));
        apxu apxu = this.ar;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(PhonebookEndpointOuterClass$PhonebookEndpoint.phonebookEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                apxu = this.ar;
                access$000 = anxl.checkIsLite(PhonebookEndpointOuterClass$PhonebookEndpoint.phonebookEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                PhonebookEndpointOuterClass$PhonebookEndpoint phonebookEndpointOuterClass$PhonebookEndpoint = (PhonebookEndpointOuterClass$PhonebookEndpoint) b;
                avye avye = phonebookEndpointOuterClass$PhonebookEndpoint.b;
                if (avye == null) {
                    avye = avye.c;
                }
                if ((avye.a & 1) != 0) {
                    TextView textView = (TextView) a.findViewById(R.id.empty_message_text);
                    avye avye2 = phonebookEndpointOuterClass$PhonebookEndpoint.b;
                    if (avye2 == null) {
                        avye2 = avye.c;
                    }
                    auwl auwl = avye2.b;
                    if (auwl == null) {
                        auwl = auwl.i;
                    }
                    arml arml = auwl.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    textView.setText(ajqy.a(arml));
                }
            }
        }
        a.findViewById(R.id.retry_button).setOnClickListener(new aljw(this));
        a.findViewById(R.id.close_button).setOnClickListener(this);
        return a;
    }

    public final void W_() {
        super.W_();
        if (this.ax) {
            dismiss();
        }
    }

    public final void B() {
        super.B();
        this.as.b();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ay = true;
        alfz alfz = this.az;
        if (alfz != null) {
            alfz.cancel(true);
        }
    }

    public final void X_() {
        super.X_();
        this.ag.b(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final aleg a(alpo alpo, alel alel) {
        return new alfx(alpo, alel, this.af, this.ar, this.ai, this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(alei alei) {
        Context M_ = M_();
        if (M_ != null) {
            if (VERSION.SDK_INT < 23 || M_.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                this.ax = true;
            } else {
                this.az = new alfz(M_, ((alfx) this.ae).f, this, alei, this.ah);
                this.az.execute(new Void[0]);
            }
        }
    }

    public final void a(String[] strArr, alei alei) {
        if (!this.ay) {
            if (strArr.length == 0) {
                alei.a(new akab());
            } else {
                aarh aarh = this.Z;
                apxu apxu = this.ar;
                byte[] d = (apxu.a & 1) != 0 ? apxu.b.d() : null;
                afsw aljz = new aljz(this, alei);
                aaml aatx = new aatx(aarh.c, aarh.d.c());
                aatx.a = strArr;
                if (d == null) {
                    d = zzp.b;
                }
                aatx.a(d);
                aarh.a(ajvl.class, aarh.b, aasb.a).a(aatx, aljz);
            }
            this.az = null;
        }
    }

    public final void a(alnn alnn) {
        if (!this.D) {
            this.ao.setVisibility(!alnn.isEmpty() ? 8 : 0);
        }
    }

    public final void onClick(View view) {
        dismiss();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zye.class};
        } else if (i == 0) {
            alpu.a(this.ak, this.aw, (zye) obj, aq, this.ab, Integer.valueOf(xwe.a(M_(), R.attr.ytStaticBlue, 0)));
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
