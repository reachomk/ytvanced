package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import defpackage.aapn;
import defpackage.aaps;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.acwl;
import defpackage.ads;
import defpackage.aej;
import defpackage.amqw;
import defpackage.anxl;
import defpackage.anxp;
import defpackage.anxr;
import defpackage.aoym;
import defpackage.apge;
import defpackage.apxu;
import defpackage.apxx;
import defpackage.avjd;
import defpackage.avjf;
import defpackage.avjh;
import defpackage.biw;
import defpackage.nf;
import defpackage.nlp;
import defpackage.nt;
import defpackage.or;
import defpackage.ukb;
import defpackage.xpr;
import defpackage.xse;
import defpackage.zek;
import defpackage.zem;
import defpackage.zet;
import defpackage.zex;
import defpackage.zey;
import defpackage.zez;
import defpackage.zfa;
import defpackage.zfb;
import defpackage.zfd;
import defpackage.zfi;
import defpackage.zfk;
import defpackage.zfm;
import defpackage.zfn;
import defpackage.zfr;
import defpackage.zfx;

public class AudioSelectionActivity extends aej implements zey, zfk, zfn, zfr, zfx {
    public nt g;
    public zfd h;
    public ViewPager i;
    public AudioSwapTabsBar j;
    public View k;
    public ProgressBar l;
    public View m;
    public acvx n;
    public aapn o;
    public boolean p = false;
    private ads q;
    private Button r;
    private zfi s;
    private ukb t;
    private zex u;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.audio_swap_audio_selection);
        this.g = f();
        this.k = findViewById(R.id.audio_swap_loading_view);
        this.m = this.k.findViewById(R.id.audio_swap_error_indicator);
        this.l = (ProgressBar) this.k.findViewById(R.id.audio_swap_loading_indicator);
        this.i = (ViewPager) findViewById(R.id.audio_swap_audio_selection_view_pager);
        this.j = (AudioSwapTabsBar) findViewById(R.id.audio_swap_audio_selection_tabs_bar);
        biw biw = this.j;
        ViewPager viewPager = this.i;
        biw.a = viewPager;
        viewPager.a(biw);
        this.r = (Button) this.k.findViewById(R.id.audio_swap_retry_button);
        this.r.setOnClickListener(new zfa(this));
        this.q = (ads) amqw.a(g());
        this.q.g();
        this.q.b(true);
        this.q.i();
        a(false);
        ((zfb) xse.a(getApplication())).a(this);
        apxx apxx = (apxx) apxu.d.createBuilder();
        String stringExtra = getIntent().getStringExtra("parent_csn");
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.a(getIntent().getIntExtra("parent_ve_type", 0));
        if (stringExtra != null) {
            avjh.a(stringExtra);
        }
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        this.n.a(acwl.aw, (apxu) ((anxl) apxx.build()), null);
        this.n.b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_SELECT_BUTTON, null);
        this.t = new ukb(this);
        q();
        p();
        this.s = new zfi(this, this.n, getIntent().getBooleanExtra("extractor_sample_source", false));
        nf a = this.g.a("category_contents_fragment_tag");
        if (a instanceof zfm) {
            ((zfm) a).ae = this;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        this.s.a(false);
        super.onPause();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        zfi zfi = this.s;
        nlp nlp = zfi.b;
        if (nlp != null) {
            nlp.g();
        }
        zfi.b = null;
        this.s = null;
        super.onDestroy();
        this.p = true;
    }

    public final void l() {
        a(true);
        xpr.a(this.j, false);
        xpr.a(this.i, false);
    }

    public final void m() {
        xpr.a(this.j, true);
        xpr.a(this.i, true);
        a(false);
    }

    public final void a(zet zet) {
        acvx acvx = this.n;
        if (!(acvx == null || acvx.c() == null)) {
            this.n.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_SELECT_BUTTON), null);
        }
        amqw.a((Object) zet);
        Uri uri = zet.d;
        amqw.a((Object) uri);
        String scheme = uri.getScheme();
        if (!(scheme == null || scheme.equals("content")) || ukb.b(this.t.a(uri))) {
            setResult(-1, new Intent().putExtra("audio_track", zet));
            finish();
            return;
        }
        xpr.a((Context) this, (int) R.string.upload_edit_audio_swap_loading_error_text, 0);
    }

    public final void a(aoym aoym) {
        zfm zfm = new zfm();
        anxp anxp = aoym.d;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        zfm.ac = (String) amqw.a(((apge) b).c);
        zfm.ae = this;
        or f = this.g.a().a(R.id.audio_swap_audio_selection_contents_view, zfm, "category_contents_fragment_tag").f();
        f.i = 4097;
        f.a();
    }

    public final zfi n() {
        return this.s;
    }

    public final zex o() {
        if (this.u == null) {
            String str = "audio_library_service_audio_selection";
            nf a = this.g.a(str);
            if (!(a instanceof zex)) {
                a = new zex();
                or a2 = this.g.a().a(a, str);
                a2.i = 4097;
                a2.a();
            }
            this.u = (zex) a;
            this.u.a = new zek(this.o);
        }
        return this.u;
    }

    private final void a(boolean z) {
        if (z) {
            this.q.a((int) R.string.upload_edit_audio_swap_audio_selection_title_loading);
        } else {
            this.q.a((int) R.string.upload_edit_audio_swap_audio_selection_title);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.g.e() > 0) {
            this.g.c();
        } else {
            finish();
        }
        return true;
    }

    public final void p() {
        zek zek = o().a;
        zez zez = new zez(this);
        aaps a = zek.a.a();
        a.g();
        a.c("FEaudio_tracks");
        zek.a.a(a, new zem(zez, this));
    }

    public final void q() {
        this.k.setVisibility(0);
        this.l.setVisibility(0);
        this.m.setVisibility(8);
        this.i.setVisibility(8);
    }
}
