package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@Deprecated
/* renamed from: aldw */
public abstract class aldw extends nd {
    private aovk Z;
    public acvx aa;
    private Future ab;
    private aaas ac;
    public PackageManager ad;
    public RecyclerView ae;
    public xci af;
    public zzf ag;
    public ExecutorService ah;
    private View ai;
    private TextView aj;
    private TextView ak;
    private View al;
    private TopPeekingScrollView am;
    private alpj an;

    public abstract aaas W();

    public abstract acvx X();

    public abstract aarh Y();

    public void b(Bundle bundle) {
        super.b(bundle);
        a(2, 16973840);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai = layoutInflater.inflate(R.layout.share_panel_fragment, viewGroup, false);
        this.aj = (TextView) this.ai.findViewById(R.id.title);
        this.ak = (TextView) this.ai.findViewById(R.id.copy_url_button);
        this.al = this.ai.findViewById(R.id.overlay);
        this.am = (TopPeekingScrollView) this.ai.findViewById(R.id.content_container);
        this.ae = (RecyclerView) this.ai.findViewById(R.id.share_target_container);
        abe.a(this.al, new aleb(this));
        this.al.setOnClickListener(new alea(this));
        this.am.c(q().getDimensionPixelSize(R.dimen.share_panel_default_peek_amount));
        TopPeekingScrollView topPeekingScrollView = this.am;
        topPeekingScrollView.l = this.al;
        topPeekingScrollView.m = this.ae;
        return this.ai;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.ad = p().getPackageManager();
        this.Z = this.ag.i();
        apxu a = aaax.a(this.j.getByteArray("navigation_endpoint"));
        this.aa = X();
        axip axip = null;
        this.aa.a(acwl.ap, a, null);
        this.ab = this.ah.submit(new aldz(this));
        this.ac = (aaas) amqw.a(W());
        this.an = new alpj(p(), this.ac, this.aa, this, Z(), this.af);
        this.ae.a(new ans());
        this.ae.a(this.an.a);
        this.ae.a(new alee(p()));
        String str = "share_panel";
        if (this.j.containsKey(str)) {
            try {
                axip = (axip) aobp.a(this.j, str, axip.n, anxa.c());
            } catch (anyg e) {
                afpc.a(1, afpf.reactr, "Failed to parse old share panel from byte array", e);
            }
        }
        anxr access$000 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEndpoint.shareEndpoint);
        a.a(access$000);
        Object b = a.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = (ShareEndpointOuterClass$ShareEndpoint) b;
        if (axip != null) {
            a(axip);
        } else if (!shareEndpointOuterClass$ShareEndpoint.c.isEmpty()) {
            asec asec = (asec) abmi.b(shareEndpointOuterClass$ShareEndpoint.c, asec.d.getParserForType());
            if (asec == null) {
                asec = asec.d;
            }
            a(aldw.a(asec));
        } else if (shareEndpointOuterClass$ShareEndpoint.b.isEmpty()) {
            throw new IllegalArgumentException("Invalid share endpoint provided.");
        } else {
            String str2 = shareEndpointOuterClass$ShareEndpoint.b;
            this.af.d(new alhf());
            aarh Y = Y();
            List a2 = alpq.a(aa(), this.Z);
            afsw aled = new aled(this);
            aaml aatu = new aatu(Y.c, Y.d.c());
            aatu.a = str2;
            aatu.b = a2;
            Y.a(asec.d, Y.g, aass.a, aasv.a).a(aatu, aled);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        alpj alpj = this.an;
        int Z = Z();
        amqw.a(Z > 0);
        if (alpj.d != Z) {
            alpj.d = Z;
            alpj.a();
        }
    }

    public void W_() {
        this.af.d(new alhh());
        super.W_();
    }

    public void N_() {
        this.af.d(new alhe());
        super.N_();
    }

    public final void a(axip axip) {
        arml arml;
        axhz axhz;
        xci xci = this.af;
        axip.c.size();
        axip.d.size();
        xci.d(new alhg());
        this.aa.a(axip.j.d());
        TextView textView = this.aj;
        if ((axip.a & 4) != 0) {
            arml = axip.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        if ((axip.a & 16) != 0) {
            axib axib = axip.g;
            if (axib == null) {
                axib = axib.c;
            }
            axhz = axib.b;
            if (axhz == null) {
                axhz = axhz.e;
            }
        } else {
            axhz = null;
        }
        if (axhz != null) {
            arml arml2;
            TextView textView2 = this.ak;
            if ((axhz.a & 1) != 0) {
                arml2 = axhz.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            textView2.setText(ajqy.a(arml2));
            this.ak.setOnClickListener(new alef(this, axhz));
        } else {
            textView = this.ak;
            if ((axip.a & 8) != 0) {
                arml = axip.f;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            this.ak.setOnClickListener(new alec(this, axip));
        }
        this.ak.setVisibility(0);
        Map hashMap = new HashMap();
        for (Object obj : aa()) {
            xsb.a(hashMap, obj.activityInfo.applicationInfo.packageName, obj);
        }
        apxu apxu = axip.h;
        if (apxu == null) {
            apxu = apxu.d;
        }
        List a = aldw.a(axip.c, hashMap, this.ad, apxu);
        List a2 = aldw.a(axip.d, hashMap, this.ad, apxu);
        ArrayList arrayList = new ArrayList();
        for (Set<ResolveInfo> it : hashMap.values()) {
            for (ResolveInfo alpe : it) {
                arrayList.add(new alpe(this.ad, alpe, apxu, axip.i.d()));
            }
        }
        Collections.sort(arrayList, new aldy(Collator.getInstance()));
        a2.addAll(arrayList);
        alpj alpj = this.an;
        alpj.b.clear();
        alpj.b.addAll(a);
        alpj.c.clear();
        alpj.c.addAll(a2);
        alpj.a();
        this.aa.a(axip.j.d(), null);
    }

    private final int Z() {
        Resources q = q();
        if (q.getConfiguration().orientation == 1) {
            return q.getInteger(R.integer.share_panel_portrait_columns);
        }
        return q.getInteger(R.integer.share_panel_landscape_columns);
    }

    public final void b(String str) {
        Context p = p();
        ((ClipboardManager) p.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", str));
        xpr.a(p, (int) R.string.share_copy_url_success, 0);
    }

    private final List aa() {
        try {
            return (List) this.ab.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            xtl.a("Error retrieving share-capable activities.", e);
            return new ArrayList();
        }
    }

    private static List a(List list, Map map, PackageManager packageManager, apxu apxu) {
        ArrayList arrayList = new ArrayList();
        for (axih axih : list) {
            axid axid = axih.b;
            if (axid == null) {
                axid = axid.f;
            }
            apxu apxu2 = axid.c;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            Iterator it = xsb.b(map, alpe.a(apxu2)).iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                axid axid2 = axih.b;
                if (axid2 == null) {
                    axid2 = axid.f;
                }
                arrayList.add(new alpe(packageManager, resolveInfo, apxu, axid2.e.d()));
                it.remove();
            }
        }
        return arrayList;
    }

    public static axip a(asec asec) {
        aqot aqot = asec.c;
        if (aqot == null) {
            aqot = aqot.c;
        }
        if ((aqot.a & 1) == 0) {
            return null;
        }
        aqot aqot2 = asec.c;
        if (aqot2 == null) {
            aqot2 = aqot.c;
        }
        axip axip = aqot2.b;
        if (axip == null) {
            axip = axip.n;
        }
        return axip;
    }
}
