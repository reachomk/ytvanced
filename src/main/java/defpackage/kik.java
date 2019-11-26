package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackgroundPromoRendererOuterClass;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: kik */
public final class kik implements akot {
    public final Activity a;
    public final Executor b;
    public final akkl c;
    public final SharedPreferences d;
    public final Map e;
    public final LinearLayout f;
    public boolean g;
    public boolean h;
    private final akvo i;
    private final amav j;
    private final ambf k = new kip(this);
    private final afpu l;
    private final akpb m;
    private final alyf n;
    private final kis o;
    private kjb p;
    private akor q;
    private anjv r;
    private akot s;

    public kik(Activity activity, Executor executor, afpu afpu, amav amav, akkl akkl, akvo akvo, bcaa bcaa, alyf alyf) {
        this.a = activity;
        this.b = executor;
        this.l = afpu;
        this.c = akkl;
        this.i = akvo;
        this.j = amav;
        this.m = (akpb) bcaa.get();
        this.n = alyf;
        this.f = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.reel_pending_uploads_root_view, null);
        this.e = new HashMap();
        this.g = false;
        this.d = xly.a(activity.getApplicationContext());
        this.o = new kis(this);
    }

    public final View K_() {
        return this.f;
    }

    public final void a(akpb akpb) {
        kjb kjb = this.p;
        if (kjb != null) {
            kjb.c();
            this.p = null;
        }
        this.j.a();
        this.j.b(this.k);
        if (this.g) {
            this.g = false;
            if (!this.r.isDone()) {
                this.r.cancel(true);
            }
            this.n.a(this.o);
        }
        ArrayList arrayList = new ArrayList(this.e.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b((String) arrayList.get(i));
        }
        this.f.removeAllViews();
        akot akot = this.s;
        if (akot != null) {
            akot.K_().setPadding(0, 0, 0, 0);
            akoz.a(this.s, akpb);
            this.s = null;
        }
    }

    public final void a(String str) {
        fno fno = (fno) this.e.get(str);
        View findViewWithTag = this.f.findViewWithTag(str);
        if (fno != null && findViewWithTag != null) {
            ProgressBar progressBar = (ProgressBar) findViewWithTag.findViewById(R.id.reel_upload_progressbar);
            double d = fno.f;
            double d2 = fno.g;
            double d3 = fno.h;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", new int[]{(int) ((((d + d2) + d3) / 3.0d) * 95.0d)});
            ofInt.setDuration(250);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.start();
        }
    }

    public final void a(amea amea) {
        int a = amek.a(amea.h);
        if (a != 0 && a == 5 && this.l.c() != null && this.l.c().a() != null && this.l.c().a().equals(amea.c)) {
            String str = amea.g;
            xvd.a(str);
            fno fno = (fno) this.e.get(str);
            if (fno == null) {
                auvs auvs = (auvs) auvp.h.createBuilder();
                auvs.a(ajqy.a(this.a.getResources().getString(R.string.delete_reel_upload)));
                aquo aquo = (aquo) DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d.createBuilder();
                aquo.a(amea.g);
                apxx apxx = (apxx) apxu.d.createBuilder();
                apxx.a(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint, (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) ((anxl) aquo.build()));
                auvs.a(apxx);
                auvm auvm = (auvm) auvj.j.createBuilder();
                auvm.a(auvs);
                auvj auvj = (auvj) ((anxl) auvm.build());
                auvq auvq = (auvq) auvn.l.createBuilder();
                auvq.a(auvj);
                fno fno2 = new fno(str, (auvn) ((anxl) auvq.build()), amea.d);
                this.e.put(str, fno2);
                this.j.a(amea.g, null, amea.F);
                fno = fno2;
            }
            amec amec = amea.s;
            if (amec == null) {
                amec = amec.g;
            }
            fno.a(amec);
            if (amea.M) {
                fno.a();
            }
            String str2 = amea.g;
            fno fno3 = (fno) this.e.get(str2);
            if (fno3 != null && this.f.findViewWithTag(str2) == null) {
                View view = (RelativeLayout) LayoutInflater.from(this.a).inflate(R.layout.reel_pending_upload, this.f, false);
                view.setTag(str2);
                ImageView imageView = (ImageView) view.findViewById(R.id.reel_upload_thumbnail);
                Uri uri = fno3.a;
                if (uri != null) {
                    String queryParameter = uri.getQueryParameter("videoThumbnailFilePath");
                    if (queryParameter != null && new File(queryParameter).exists()) {
                        int dimension = (int) this.a.getResources().getDimension(R.dimen.reel_thumbnail_width_height);
                        Bitmap a2 = ziy.a(queryParameter, dimension, dimension);
                        if (a2 != null) {
                            imageView.setImageBitmap(a2);
                            this.h = true;
                        }
                    }
                }
                View findViewById = view.findViewById(R.id.reel_action_menu_anchor);
                auvn auvn = fno3.c;
                if (auvn != null) {
                    this.i.a(view, findViewById, auvn, fno3, this.q.a);
                    findViewById.setVisibility(0);
                }
                a(str2);
                this.f.addView(view, 0);
                a(fno3);
                this.f.setVisibility(0);
                if (xrn.c(this.f.getContext())) {
                    xrn.a(this.f.getContext(), view, this.f.getContext().getString(R.string.reel_upload_content_description));
                }
            }
        }
    }

    public final void a(fno fno) {
        amqw.a((Object) fno);
        View findViewWithTag = this.f.findViewWithTag(fno.b);
        if (findViewWithTag != null) {
            ProgressBar progressBar = (ProgressBar) findViewWithTag.findViewById(R.id.reel_upload_progressbar);
            TextView textView = (TextView) findViewWithTag.findViewById(R.id.reel_upload_status_message);
            if (fno.d || fno.j == 3 || fno.e) {
                progressBar.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(R.string.reel_upload_transfer_failed_message);
            } else {
                int i = fno.i;
                if (i == 2) {
                    progressBar.setVisibility(8);
                    textView.setText(R.string.reel_upload_waiting_for_network_message);
                    textView.setVisibility(0);
                } else if (i == 1) {
                    progressBar.setVisibility(8);
                    textView.setText(R.string.reel_upload_waiting_for_wifi_message);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    progressBar.setVisibility(0);
                    a(fno.b);
                }
            }
        }
    }

    public final void b(String str) {
        if (((fno) this.e.get(str)) != null) {
            this.e.remove(str);
            View findViewWithTag = this.f.findViewWithTag(str);
            ((ImageView) findViewWithTag.findViewById(R.id.reel_upload_thumbnail)).setImageDrawable(null);
            this.f.removeView(findViewWithTag);
            kjb kjb = this.p;
            if (kjb != null) {
                akxv akxv = kjb.a;
                if (akxv != null && akxv.ap_()) {
                    String str2 = "REEL_REFRESH_IN_PROGRESS";
                    if (kjb.b) {
                        kjb.a.H_();
                        kjb.c.d.edit().remove(str2).apply();
                        return;
                    }
                    kjb.c.d.edit().putBoolean(str2, true).apply();
                }
            }
        }
    }

    public final void b() {
        if (this.e.isEmpty()) {
            this.f.removeAllViews();
            this.f.setVisibility(8);
            String str = "REEL_UPLOAD_IN_PROGRESS";
            if (this.d.getBoolean(str, false)) {
                this.d.edit().remove(str).apply();
            }
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        avva avva = (avva) obj;
        this.q = (akor) amqw.a((Object) akor);
        kjb kjb = null;
        if ((avva.a & 4) != 0) {
            anxp anxp = avva.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(BackgroundPromoRendererOuterClass.backgroundPromoRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = avva.b;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(BackgroundPromoRendererOuterClass.backgroundPromoRenderer);
                anxp2.a(access$0002);
                obj = anxp2.h.b(access$0002.d);
                if (obj == null) {
                    obj = access$0002.b;
                } else {
                    obj = access$0002.a(obj);
                }
                obj = (apaj) obj;
            } else {
                obj = null;
            }
            this.s = akoz.a(this.m, obj, this.f);
            akot akot = this.s;
            if (akot != null) {
                akoz.a(akot.K_(), this.s, this.m.a(obj));
                this.s.a_(akor, obj);
                this.s.K_().setPadding(0, this.a.getResources().getDimensionPixelSize(R.dimen.reel_zero_state_view_top_padding), 0, 0);
                this.f.addView(this.s.K_());
                this.f.setVisibility(0);
            }
        }
        if (this.d.getBoolean("REEL_UPLOAD_IN_PROGRESS", false)) {
            akor = this.q;
            akxv akxv = akor != null ? (akxv) akor.a("sectionListController") : null;
            if (akxv != null) {
                kjb = new kjb(this, akxv);
            }
            this.p = kjb;
            afpt c = this.l.c();
            this.j.a(this.k);
            this.n.a(c, this.o);
            this.r = this.n.a(c);
            this.g = true;
            xan.a(this.r, this.b, kin.a, new kim(this));
            kjb kjb2 = this.p;
            if (kjb2 != null) {
                kjb2.d();
            }
        }
    }
}
