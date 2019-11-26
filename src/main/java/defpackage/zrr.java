package defpackage;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.youtube.R;

/* renamed from: zrr */
public final class zrr extends zrg implements OnClickListener, OnLayoutChangeListener, OnScrollChangedListener, uje, unj, zon, zsb {
    private VideoWithPreviewView Z;
    public ScrollView a;
    private ImageButton ab;
    private ImageButton ac;
    private EditableVideoControllerView ad;
    private VideoTrimView ae;
    private AudioTrackView af;
    private ImageButton ag;
    private AudioCrossFadeView ah;
    private ChooseFilterView ai;
    private View aj;
    private View ak;
    private int al = -1;
    private float b;
    private View c;

    /* Access modifiers changed, original: protected|final */
    public final int ac() {
        return R.fraction.upload_edit_video_fragment_max_video_height;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ad() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final AudioCrossFadeView aj() {
        return this.ah;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageButton ay() {
        return this.ag;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageButton ah() {
        return this.ab;
    }

    /* Access modifiers changed, original: protected|final */
    public final AudioTrackView ai() {
        return this.af;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageButton X() {
        return this.ac;
    }

    /* Access modifiers changed, original: protected|final */
    public final ChooseFilterView Z() {
        return this.ai;
    }

    /* Access modifiers changed, original: protected|final */
    public final VideoTrimView ae() {
        return this.ae;
    }

    /* Access modifiers changed, original: protected|final */
    public final EditableVideoControllerView Y() {
        return this.ad;
    }

    /* Access modifiers changed, original: protected|final */
    public final VideoWithPreviewView W() {
        return this.Z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void aD() {
        this.ab.setImageResource(R.drawable.ic_audioswap_button_32dp);
    }

    /* Access modifiers changed, original: protected|final */
    public final void an() {
        ImageButton imageButton = this.ac;
        boolean f = this.ai.c().f();
        int i = R.drawable.ic_filter_button_32dp;
        if (f) {
            zjy zjy = this.aC;
            if (zjy != null && zjy.a(ayzc.EFFECTS_FEATURE_DOT_ON_FILTER_ICON)) {
                i = R.drawable.ic_filter_button_with_dot_32dp;
            }
        }
        imageButton.setImageResource(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Throwable th) {
        afpf afpf = afpf.media;
        String valueOf = String.valueOf(zjf.a(th));
        String str = "youtubeUploadExoPlayerPreview::";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        afpc.a(2, afpf, valueOf, th);
    }

    /* Access modifiers changed, original: protected|final */
    public final View aa() {
        return this.aj;
    }

    /* Access modifiers changed, original: protected|final */
    public final View ab() {
        return this.ak;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((zrs) xse.a(p())).a(this);
    }

    public final void a(Activity activity) {
        super.a(activity);
        this.b = activity.getResources().getDimension(R.dimen.upload_edit_video_fragment_scroll_play_threshold);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.upload_edit_video_fragment, viewGroup, false);
        inflate.setWillNotDraw(false);
        inflate.setBackgroundColor(-16777216);
        this.c = inflate.findViewById(R.id.video_view_container);
        this.c.setOnClickListener(this);
        this.Z = (VideoWithPreviewView) inflate.findViewById(R.id.video_view);
        this.Z.setOnClickListener(this);
        this.Z.addOnLayoutChangeListener(this);
        this.aj = inflate.findViewById(R.id.video_loading_indicator);
        this.ak = inflate.findViewById(R.id.effect_pending_indicator);
        this.ab = (ImageButton) inflate.findViewById(R.id.audio_swap_button);
        this.ab.setOnClickListener(this);
        this.ac = (ImageButton) inflate.findViewById(R.id.choose_filter_button);
        this.ac.setOnClickListener(this);
        this.ad = (EditableVideoControllerView) inflate.findViewById(R.id.editable_video_controller);
        this.ae = (VideoTrimView) inflate.findViewById(R.id.video_trim);
        VideoTrimView videoTrimView = this.ae;
        videoTrimView.h = new uiv(M_(), inflate);
        uiv uiv = videoTrimView.h;
        if (uiv != null) {
            uiv.f = videoTrimView.b;
        }
        this.af = (AudioTrackView) inflate.findViewById(R.id.audio_track);
        this.ag = (ImageButton) inflate.findViewById(R.id.audio_mixer_button);
        this.ag.setOnClickListener(this);
        this.ah = (AudioCrossFadeView) inflate.findViewById(R.id.audio_cross_fade);
        this.ai = (ChooseFilterView) inflate.findViewById(R.id.choose_filter_view);
        ChooseFilterView chooseFilterView = this.ai;
        LayoutParams layoutParams = (LayoutParams) chooseFilterView.c.getLayoutParams();
        layoutParams.gravity = 80;
        chooseFilterView.c.setLayoutParams(layoutParams);
        this.ai.a((zon) this);
        return inflate;
    }

    public final void onClick(View view) {
        if (view == this.c || view == this.Z) {
            ScrollView scrollView = this.a;
            if (scrollView != null) {
                int scrollY = scrollView.getScrollY();
                if (scrollY != this.Z.getTop()) {
                    ScrollView scrollView2 = this.a;
                    scrollView2.smoothScrollTo(scrollView2.getScrollX(), this.Z.getTop());
                    f(VERSION.SDK_INT >= 21 ? 0 : 250);
                }
                if (((float) Math.abs(scrollY - this.Z.getTop())) < this.b) {
                    this.ad.b();
                }
            }
            return;
        }
        super.onClick(view);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == this.Z && this.a != null) {
            ao();
        }
    }

    public final void onScrollChanged() {
        ScrollView scrollView = this.a;
        if (scrollView != null) {
            int scrollY = scrollView.getScrollY();
            if (scrollY != this.al) {
                this.al = scrollY;
                ao();
                if (scrollY == 0) {
                    f(0);
                }
            }
            if (((float) Math.abs(scrollY - this.Z.getTop())) > this.b) {
                umr umr = this.at.h;
                if (umr != null) {
                    umr.a(false);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z, boolean z2, int i, int i2, int i3) {
        AudioCrossFadeView audioCrossFadeView = this.ah;
        int i4 = 8;
        if (z && !z2) {
            i4 = 0;
        }
        audioCrossFadeView.setVisibility(i4);
        this.ah.setPadding(i, 0, i2 + i3, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(int i) {
        this.af.setPadding(0, 0, i, 0);
    }

    private final void ao() {
        int height;
        float max = (float) (Math.max(0, this.a.getScrollY() - this.c.getTop()) / 2);
        this.c.setTranslationY(max);
        ChooseFilterView chooseFilterView = this.ai;
        if (chooseFilterView.f) {
            height = chooseFilterView.getHeight();
        } else if (this.ae.getVisibility() == 0) {
            height = this.ae.getHeight();
            if (this.af.getVisibility() == 0) {
                height += this.af.getHeight();
            }
        } else {
            height = this.ad.getHeight();
        }
        float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, max / ((float) ((height + height) / 3))));
        this.ae.setTranslationY(max);
        this.ae.setAlpha(max2);
        this.af.setTranslationY(max);
        this.af.setAlpha(max2);
        this.ah.setTranslationY(max);
        this.ah.setAlpha(max2);
        this.ag.setTranslationY(max);
        this.ag.setAlpha(max2);
        chooseFilterView = this.ai;
        if (chooseFilterView.f) {
            chooseFilterView.setTranslationY(max);
            this.ai.b.setAlpha(max2);
        }
        this.ad.setTranslationY(max);
        this.ad.setAlpha(max2);
    }

    private final void f(int i) {
        View view = this.K;
        if (view != null) {
            view.postDelayed(new zrt(this), (long) i);
        }
    }

    public final void f() {
        this.ac.sendAccessibilityEvent(8);
    }

    /* Access modifiers changed, original: protected|final */
    public final void am() {
        this.ai.setBackgroundColor(q().getColor(R.color.upload_edit_choose_filter_view_background));
    }
}
