package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;
import com.google.android.youtube.R;

/* renamed from: gpa */
public final class gpa extends aiua implements gob, god {
    public final goy a;
    public final goa b;
    public final got c;
    public final ReelPlayerProgressPresenter d;
    public final goe e;
    public final gof f;
    public final View g;
    public final ImageView h;
    public final ImageView i;
    public final aizy j;
    public final gpt k;
    public final gph l;
    private final gov m;
    private final gpo n;
    private final gnz o;
    private final gpp p;
    private final View q;
    private final View r;
    private final ImageView s;
    private final View t;
    private final Animation u;
    private final String v;
    private final String w;
    private final acwa x;

    public gpa(Context context, akkq akkq, aizy aizy, acwa acwa, goe goe, gof gof, goa goa, got got, est est, gpq gpq, aaas aaas, gpt gpt, gph gph) {
        Context context2 = context;
        akkq akkq2 = akkq;
        acwa acwa2 = acwa;
        goe goe2 = goe;
        gof gof2 = gof;
        got got2 = got;
        super(context);
        this.j = (aizy) amqw.a((Object) aizy);
        this.x = acwa2;
        this.e = goe2;
        this.f = gof2;
        this.b = goa;
        this.c = got2;
        this.k = gpt;
        this.l = (gph) amqw.a((Object) gph);
        goe2.a = (god) amqw.a((Object) this);
        goe2.c = got2;
        LayoutInflater.from(context).inflate(R.layout.reel_player_overlay2, this);
        amqw.a((Object) this);
        got2.a = (View) amqw.a(findViewById(R.id.reel_loading_spinner));
        got2.c = findViewById(R.id.reel_error_scrim);
        got2.b = findViewById(R.id.reel_error_group);
        got2.d = findViewById(R.id.reel_error_icon);
        got2.e = (TextView) findViewById(R.id.reel_error_message);
        amqw.a((Object) this);
        amqw.a(findViewById(R.id.reel_edu_group));
        Object obj = (ImageView) findViewById(R.id.reel_swipe_image_view);
        gof2.c = (ImageView) amqw.a(obj);
        Resources resources = obj.getContext().getResources();
        xna xna = new xna();
        gof2.d = new gon(new ColorDrawable(resources.getColor(R.color.yt_black4)));
        gof2.e = new akle(new akkj(gof2.a), xna, new goi(gof2), obj, true);
        this.r = findViewById(R.id.reel_player_overlay_layout);
        this.d = (ReelPlayerProgressPresenter) findViewById(R.id.reel_progress_bar);
        this.a = new goy(this, akkq2);
        this.a.h = (gph) amqw.a((Object) gph);
        this.p = new gpp(this.r, akkq2);
        this.m = new gov(this, acwa2, aaas);
        this.n = new gpo(context, this, acwa2, est, gpq);
        this.o = new gnz(this, this);
        this.u = AnimationUtils.loadAnimation(getContext(), R.anim.reel_seek_feedback_anim);
        this.q = findViewById(R.id.reel_video_link);
        this.h = (ImageView) findViewById(R.id.reel_seek_feedback_prev);
        this.i = (ImageView) findViewById(R.id.reel_seek_feedback_next);
        this.t = findViewById(R.id.reel_control_group);
        this.v = context.getString(R.string.reel_accessibility_play_video);
        this.w = context.getString(R.string.reel_accessibility_pause_video);
        xpr.a(this.t, xrn.c(context));
        findViewById(R.id.reel_close_button).setOnClickListener(new goz(this));
        findViewById(R.id.reel_video_link).setOnClickListener(new gpc(this));
        findViewById(R.id.reel_prev_video_button).setOnClickListener(new gpb(this));
        findViewById(R.id.reel_next_video_button).setOnClickListener(new gpe(this));
        findViewById(R.id.reel_prev_reel_button).setOnClickListener(new gpd(this));
        findViewById(R.id.reel_next_reel_button).setOnClickListener(new gpg(this));
        this.s = (ImageView) findViewById(R.id.reel_play_pause_button);
        this.s.setOnClickListener(new gpf(this));
        OnClickListener onClickListener = gpi.a;
        View findViewById = findViewById(R.id.reel_player_no_nav_top);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
        this.g = findViewById(R.id.reel_player_no_nav_bottom);
        findViewById = this.g;
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.l.a(z);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.e.b(motionEvent);
        return true;
    }

    public final void ab_() {
        this.l.Z();
    }

    public final void a(ajzq ajzq) {
        a(ajzq, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x042f A:{SYNTHETIC, EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  , EDGE_INSN: B:294:0x042f->B:225:0x042f ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0426 A:{LOOP_END, LOOP:0: B:222:0x0421->B:224:0x0426} */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0433 A:{LOOP_END, LOOP:1: B:226:0x0431->B:227:0x0433} */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0449 A:{LOOP_END, LOOP:2: B:229:0x0447->B:230:0x0449} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0590  */
    public final void a(defpackage.ajzq r19, boolean r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        if (r1 == 0) goto L_0x000f;
    L_0x0008:
        r1 = r1.a;
        if (r1 == 0) goto L_0x000f;
    L_0x000c:
        r1 = r1.a;
        goto L_0x0010;
    L_0x000f:
        r1 = 0;
    L_0x0010:
        r4 = 1;
        if (r1 == 0) goto L_0x0024;
    L_0x0013:
        r5 = r1.b;
        if (r5 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0024;
    L_0x0018:
        r6 = r5.a;
        r6 = r6 & r4;
        if (r6 == 0) goto L_0x0024;
    L_0x001d:
        r5 = r5.b;
        if (r5 != 0) goto L_0x0025;
    L_0x0021:
        r5 = defpackage.awyb.h;
        goto L_0x0025;
    L_0x0024:
        r5 = 0;
    L_0x0025:
        if (r5 != 0) goto L_0x0028;
    L_0x0027:
        goto L_0x003a;
    L_0x0028:
        if (r2 == 0) goto L_0x003a;
    L_0x002a:
        r6 = r0.x;
        r6 = r6.t();
        r7 = new acvs;
        r8 = r5.g;
        r7.<init>(r8);
        r6.b(r7);
    L_0x003a:
        r6 = r0.a;
        r7 = 2;
        if (r5 != 0) goto L_0x0041;
    L_0x003f:
        r8 = 0;
        goto L_0x0050;
    L_0x0041:
        r8 = r5.a;
        r8 = r8 & r7;
        if (r8 == 0) goto L_0x003f;
    L_0x0046:
        r8 = r5.c;
        if (r8 != 0) goto L_0x004c;
    L_0x004a:
        r8 = defpackage.arml.f;
    L_0x004c:
        r8 = defpackage.ajqy.a(r8);
    L_0x0050:
        if (r5 != 0) goto L_0x0054;
    L_0x0052:
        r9 = 0;
        goto L_0x0063;
    L_0x0054:
        r9 = r5.a;
        r9 = r9 & r4;
        if (r9 == 0) goto L_0x0052;
    L_0x0059:
        r9 = r5.b;
        if (r9 != 0) goto L_0x005f;
    L_0x005d:
        r9 = defpackage.arml.f;
    L_0x005f:
        r9 = defpackage.ajqy.a(r9);
    L_0x0063:
        if (r5 != 0) goto L_0x0067;
    L_0x0065:
        r10 = 0;
        goto L_0x0077;
    L_0x0067:
        r10 = r5.a;
        r10 = r10 & 8;
        if (r10 == 0) goto L_0x0065;
    L_0x006d:
        r10 = r5.e;
        if (r10 != 0) goto L_0x0073;
    L_0x0071:
        r10 = defpackage.arml.f;
    L_0x0073:
        r10 = defpackage.ajqy.a(r10);
    L_0x0077:
        if (r10 != 0) goto L_0x007c;
    L_0x0079:
        r10 = r9;
        r9 = 0;
        goto L_0x0088;
    L_0x007c:
        r11 = r10.length();
        if (r11 == 0) goto L_0x0079;
    L_0x0082:
        r11 = r10.equals(r9);
        if (r11 != 0) goto L_0x0079;
    L_0x0088:
        r11 = r6.c;
        r12 = 0;
        if (r9 == 0) goto L_0x008f;
    L_0x008d:
        r13 = 1;
        goto L_0x0090;
    L_0x008f:
        r13 = 0;
    L_0x0090:
        defpackage.xpr.a(r11, r13);
        r11 = r6.d;
        if (r10 == 0) goto L_0x0099;
    L_0x0097:
        r13 = 1;
        goto L_0x009a;
    L_0x0099:
        r13 = 0;
    L_0x009a:
        defpackage.xpr.a(r11, r13);
        r11 = r6.c;
        r13 = "";
        if (r9 != 0) goto L_0x00a5;
    L_0x00a3:
        r14 = r13;
        goto L_0x00a6;
    L_0x00a5:
        r14 = r9;
    L_0x00a6:
        r11.setText(r14);
        r11 = r6.d;
        if (r10 != 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00af;
    L_0x00ae:
        r13 = r10;
    L_0x00af:
        r11.setText(r13);
        r11 = r6.d;
        if (r9 != 0) goto L_0x00b9;
    L_0x00b6:
        r9 = android.graphics.Typeface.DEFAULT_BOLD;
        goto L_0x00bb;
    L_0x00b9:
        r9 = android.graphics.Typeface.DEFAULT;
    L_0x00bb:
        r11.setTypeface(r9);
        r9 = r6.e;
        if (r8 == 0) goto L_0x00c4;
    L_0x00c2:
        r11 = 1;
        goto L_0x00c5;
    L_0x00c4:
        r11 = 0;
    L_0x00c5:
        defpackage.xpr.a(r9, r11);
        if (r8 == 0) goto L_0x00cf;
    L_0x00ca:
        r9 = r6.e;
        r9.setText(r8);
    L_0x00cf:
        r9 = r6.f;
        if (r10 != 0) goto L_0x00d5;
    L_0x00d3:
        r8 = 0;
        goto L_0x00d9;
    L_0x00d5:
        if (r8 != 0) goto L_0x00d8;
    L_0x00d7:
        goto L_0x00d3;
    L_0x00d8:
        r8 = 1;
    L_0x00d9:
        defpackage.xpr.a(r9, r8);
        if (r5 != 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00f1;
    L_0x00df:
        r8 = r5.a;
        r8 = r8 & 16;
        if (r8 == 0) goto L_0x00f1;
    L_0x00e5:
        r8 = r6.a;
        r5 = r5.f;
        if (r5 != 0) goto L_0x00ed;
    L_0x00eb:
        r5 = defpackage.aygk.f;
    L_0x00ed:
        r8.a(r5);
        goto L_0x00f9;
    L_0x00f1:
        r5 = r6.b;
        r8 = 2131559565; // 0x7f0d048d float:1.8744478E38 double:1.053130353E-314;
        r5.setImageResource(r8);
    L_0x00f9:
        r5 = r6.b;
        defpackage.xpr.a(r5, r4);
        r5 = r0.m;
        r5.a();
        if (r1 == 0) goto L_0x0259;
    L_0x0105:
        r5.h = r1;
        r6 = r1.k;
        if (r6 == 0) goto L_0x0227;
    L_0x010b:
        r6 = r1.a;
        if (r6 == 0) goto L_0x0189;
    L_0x010f:
        r6 = r5.a;
        r8 = 2131758109; // 0x7f100c1d float:1.9147173E38 double:1.053228447E-314;
        r6 = r6.findViewById(r8);
        r6 = (android.widget.TextView) r6;
        r5.d = r6;
        r6 = r5.d;
        r8 = r5.h;
        r8 = r8.a;
        if (r8 == 0) goto L_0x0126;
    L_0x0124:
        r8 = 1;
        goto L_0x0127;
    L_0x0126:
        r8 = 0;
    L_0x0127:
        defpackage.ggh.a(r6, r8);
        r6 = r5.d;
        r8 = r5.h;
        r8 = r8.a;
        defpackage.gov.a(r6, r8);
        r6 = r5.a;
        r8 = 2131758110; // 0x7f100c1e float:1.9147175E38 double:1.0532284474E-314;
        r6 = r6.findViewById(r8);
        r6 = (android.widget.TextView) r6;
        r5.g = r6;
        r6 = r5.h;
        r6 = r6.k;
        r8 = defpackage.aphg.class;
        r6 = defpackage.ajzv.a(r6, r8);
        r6 = (defpackage.aphg) r6;
        r8 = r5.g;
        if (r6 == 0) goto L_0x0152;
    L_0x0150:
        r9 = 1;
        goto L_0x0153;
    L_0x0152:
        r9 = 0;
    L_0x0153:
        defpackage.ggh.a(r8, r9);
        r8 = r5.g;
        defpackage.gov.a(r8, r6);
        if (r6 == 0) goto L_0x017b;
    L_0x015d:
        r8 = r5.b;
        r8 = r8.t();
        r9 = new acvs;
        r10 = r6.r;
        r9.<init>(r10);
        r8.b(r9);
        r8 = r5.g;
        r8.setOnClickListener(r5);
        r8 = r5.g;
        r6 = defpackage.gov.a(r6);
        r8.setContentDescription(r6);
    L_0x017b:
        r5 = r5.a;
        r6 = 2131758108; // 0x7f100c1c float:1.914717E38 double:1.0532284464E-314;
        r5 = r5.findViewById(r6);
        defpackage.ggh.a(r5, r4);
        goto L_0x0259;
    L_0x0189:
        r6 = r5.a;
        r8 = 2131758156; // 0x7f100c4c float:1.9147268E38 double:1.05322847E-314;
        r6 = r6.findViewById(r8);
        r6 = (android.widget.ImageView) r6;
        r5.e = r6;
        r6 = r5.h;
        r6 = r6.k;
        r8 = defpackage.aphg.class;
        r6 = defpackage.ajzv.a(r6, r8);
        r6 = (defpackage.aphg) r6;
        r8 = r5.e;
        if (r6 == 0) goto L_0x01a8;
    L_0x01a6:
        r9 = 1;
        goto L_0x01a9;
    L_0x01a8:
        r9 = 0;
    L_0x01a9:
        defpackage.ggh.a(r8, r9);
        r8 = r5.e;
        if (r8 == 0) goto L_0x01b7;
    L_0x01b0:
        r9 = defpackage.gov.a(r6);
        r8.setContentDescription(r9);
    L_0x01b7:
        if (r6 == 0) goto L_0x01ce;
    L_0x01b9:
        r8 = r5.b;
        r8 = r8.t();
        r9 = new acvs;
        r6 = r6.r;
        r9.<init>(r6);
        r8.b(r9);
        r6 = r5.e;
        r6.setOnClickListener(r5);
    L_0x01ce:
        r6 = r5.a;
        r8 = 2131758157; // 0x7f100c4d float:1.914727E38 double:1.0532284706E-314;
        r6 = r6.findViewById(r8);
        r6 = (android.widget.LinearLayout) r6;
        r5.f = r6;
        r6 = r5.h;
        r6 = r6.l;
        r8 = defpackage.aphg.class;
        r6 = defpackage.ajzv.a(r6, r8);
        r6 = (defpackage.aphg) r6;
        r8 = r5.f;
        if (r6 == 0) goto L_0x01ed;
    L_0x01eb:
        r9 = 1;
        goto L_0x01ee;
    L_0x01ed:
        r9 = 0;
    L_0x01ee:
        defpackage.ggh.a(r8, r9);
        if (r6 == 0) goto L_0x0203;
    L_0x01f3:
        r8 = r5.b;
        r8 = r8.t();
        r9 = new acvs;
        r10 = r6.r;
        r9.<init>(r10);
        r8.b(r9);
    L_0x0203:
        r8 = r5.a;
        r9 = 2131758159; // 0x7f100c4f float:1.9147274E38 double:1.0532284716E-314;
        r8 = r8.findViewById(r9);
        r8 = (android.widget.TextView) r8;
        r9 = r5.f;
        if (r9 == 0) goto L_0x021a;
    L_0x0212:
        defpackage.gov.a(r8, r6);
        r6 = r5.f;
        r6.setOnClickListener(r5);
    L_0x021a:
        r5 = r5.a;
        r6 = 2131758155; // 0x7f100c4b float:1.9147266E38 double:1.0532284696E-314;
        r5 = r5.findViewById(r6);
        defpackage.ggh.a(r5, r4);
        goto L_0x0259;
    L_0x0227:
        r6 = r5.a;
        r8 = 2131758134; // 0x7f100c36 float:1.9147223E38 double:1.0532284593E-314;
        r6 = r6.findViewById(r8);
        r6 = (android.widget.TextView) r6;
        r5.d = r6;
        r6 = r5.h;
        r6 = r6.a;
        if (r6 == 0) goto L_0x023c;
    L_0x023a:
        r6 = 1;
        goto L_0x023d;
    L_0x023c:
        r6 = 0;
    L_0x023d:
        r8 = r5.d;
        defpackage.ggh.a(r8, r6);
        if (r6 == 0) goto L_0x024d;
    L_0x0244:
        r6 = r5.d;
        r8 = r5.h;
        r8 = r8.a;
        defpackage.gov.a(r6, r8);
    L_0x024d:
        r5 = r5.a;
        r6 = 2131758133; // 0x7f100c35 float:1.9147221E38 double:1.053228459E-314;
        r5 = r5.findViewById(r6);
        defpackage.ggh.a(r5, r4);
    L_0x0259:
        r5 = r0.n;
        if (r1 != 0) goto L_0x025f;
    L_0x025d:
        goto L_0x0301;
    L_0x025f:
        r6 = r1.b;
        if (r6 != 0) goto L_0x0265;
    L_0x0263:
        r6 = 0;
        goto L_0x0270;
    L_0x0265:
        r8 = r6.a;
        r8 = r8 & r4;
        if (r8 == 0) goto L_0x0263;
    L_0x026a:
        r6 = r6.b;
        if (r6 != 0) goto L_0x0270;
    L_0x026e:
        r6 = defpackage.awyb.h;
    L_0x0270:
        r8 = r5.b;
        r9 = defpackage.gpq.a(r1);
        r10 = defpackage.gpq.a(r9);
        if (r10 == 0) goto L_0x02b3;
    L_0x027c:
        r11 = r8.a;
        r11 = r11.get(r10);
        r11 = (defpackage.gps) r11;
        if (r11 == 0) goto L_0x0288;
    L_0x0286:
        r13 = r11;
        goto L_0x02b4;
    L_0x0288:
        r11 = r9.q;
        if (r11 == 0) goto L_0x0293;
    L_0x028c:
        r11 = r9.o;
        if (r11 == 0) goto L_0x0291;
    L_0x0290:
        goto L_0x0293;
    L_0x0291:
        r11 = 1;
        goto L_0x0294;
    L_0x0293:
        r11 = 0;
    L_0x0294:
        r13 = r8.b;
        r13 = r13.a();
        if (r13 == 0) goto L_0x02a5;
    L_0x029c:
        r13 = r8.b;
        r13 = r13.g();
        if (r13 != 0) goto L_0x02a5;
    L_0x02a4:
        goto L_0x02a6;
    L_0x02a5:
        r11 = 0;
    L_0x02a6:
        r13 = new gps;
        r9 = r9.o;
        r13.<init>(r11, r9);
        r8 = r8.a;
        r8.put(r10, r13);
        goto L_0x02b4;
    L_0x02b3:
        r13 = 0;
    L_0x02b4:
        if (r13 == 0) goto L_0x02db;
    L_0x02b6:
        r8 = r13.a;
        if (r8 != 0) goto L_0x02bb;
    L_0x02ba:
        goto L_0x02db;
    L_0x02bb:
        r8 = defpackage.gpq.a(r1);
        if (r8 == 0) goto L_0x02dc;
    L_0x02c1:
        r9 = r13.a;
        if (r9 == 0) goto L_0x02dc;
    L_0x02c5:
        r8 = r8.toBuilder();
        r8 = (defpackage.anxo) r8;
        r8 = (defpackage.axwd) r8;
        r9 = r13.b;
        r8.a(r9);
        r8 = r8.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.axwa) r8;
        goto L_0x02dc;
    L_0x02db:
        r8 = 0;
    L_0x02dc:
        r9 = r1.k;
        if (r9 == 0) goto L_0x02f1;
    L_0x02e0:
        r9 = r5.a;
        r10 = 2131758158; // 0x7f100c4e float:1.9147272E38 double:1.053228471E-314;
        r9 = r9.findViewById(r10);
        r9 = (android.widget.TextView) r9;
        r5.c = r9;
        r5.a(r8, r6, r2);
        goto L_0x0301;
    L_0x02f1:
        r9 = r5.a;
        r10 = 2131758136; // 0x7f100c38 float:1.9147227E38 double:1.05322846E-314;
        r9 = r9.findViewById(r10);
        r9 = (android.widget.TextView) r9;
        r5.c = r9;
        r5.a(r8, r6, r2);
    L_0x0301:
        r5 = r0.o;
        r5.a();
        if (r1 == 0) goto L_0x032a;
    L_0x0308:
        r6 = r1.k;
        if (r6 != 0) goto L_0x0315;
    L_0x030c:
        r6 = r1.c;
        r8 = 2131758135; // 0x7f100c37 float:1.9147225E38 double:1.0532284597E-314;
        r5.a(r6, r8);
        goto L_0x032a;
    L_0x0315:
        r6 = r1.a;
        if (r6 == 0) goto L_0x0322;
    L_0x0319:
        r6 = r1.c;
        r8 = 2131758111; // 0x7f100c1f float:1.9147177E38 double:1.053228448E-314;
        r5.a(r6, r8);
        goto L_0x032a;
    L_0x0322:
        r6 = r1.c;
        r8 = 2131758160; // 0x7f100c50 float:1.9147276E38 double:1.053228472E-314;
        r5.a(r6, r8);
    L_0x032a:
        if (r1 == 0) goto L_0x0338;
    L_0x032c:
        r5 = r1.d;
        if (r5 != 0) goto L_0x0331;
    L_0x0330:
        goto L_0x0338;
    L_0x0331:
        r5 = r5.b;
        if (r5 != 0) goto L_0x0339;
    L_0x0335:
        r5 = defpackage.awyf.d;
        goto L_0x0339;
    L_0x0338:
        r5 = 0;
    L_0x0339:
        r6 = r0.d;
        r8 = r6.a;
        r9 = r6.b;
        r10 = r6.j;
        if (r5 == 0) goto L_0x0346;
    L_0x0343:
        r11 = r5.c;
        goto L_0x0347;
    L_0x0346:
        r11 = 0;
    L_0x0347:
        r6.a = r11;
        if (r5 == 0) goto L_0x0350;
    L_0x034b:
        r11 = r5.b;
        r11 = r11 + -1;
        goto L_0x0351;
    L_0x0350:
        r11 = 0;
    L_0x0351:
        r6.b = r11;
        r6.b();
        if (r5 == 0) goto L_0x0378;
    L_0x0358:
        r11 = r6.getResources();
        r7 = new java.lang.Object[r7];
        r13 = r5.b;
        r13 = java.lang.Integer.valueOf(r13);
        r7[r12] = r13;
        r5 = r5.c;
        r5 = java.lang.Integer.valueOf(r5);
        r7[r4] = r5;
        r5 = 2131953430; // 0x7f130716 float:1.954333E38 double:1.0533249483E-314;
        r5 = r11.getString(r5, r7);
        r6.setContentDescription(r5);
    L_0x0378:
        r13 = 0;
        r6.h = r13;
        r6.g = r13;
        r5 = 0;
        r6.f = r5;
        r6.d = r13;
        r6.e = r5;
        r7 = r6.a;
        if (r8 != r7) goto L_0x038d;
    L_0x0389:
        r7 = r6.b;
        r7 = r7 - r9;
        goto L_0x038e;
    L_0x038d:
        r7 = 0;
    L_0x038e:
        r8 = 3;
        if (r7 == 0) goto L_0x03ae;
    L_0x0391:
        r9 = java.lang.Math.abs(r7);
        if (r9 <= r8) goto L_0x0398;
    L_0x0397:
        goto L_0x03ae;
    L_0x0398:
        r13 = android.os.SystemClock.elapsedRealtime();
        r6.d = r13;
        r9 = r6.l;
        r11 = r6.n;
        r13 = r9.length;
        java.lang.System.arraycopy(r9, r12, r11, r12, r13);
        r9 = r6.m;
        r11 = r6.o;
        r13 = r9.length;
        java.lang.System.arraycopy(r9, r12, r11, r12, r13);
    L_0x03ae:
        r9 = r6.a;
        r6.j = r12;
        r11 = 7;
        if (r9 <= r11) goto L_0x03e4;
    L_0x03b5:
        r13 = r6.b;
        r14 = r9 + -3;
        if (r13 < r14) goto L_0x03c4;
    L_0x03bb:
        r9 = r9 + -7;
        r6.j = r9;
        r8 = java.lang.Math.min(r8, r9);
        goto L_0x03e6;
    L_0x03c4:
        r13 = r13 + -3;
        r9 = java.lang.Math.max(r12, r13);
        r6.j = r9;
        r9 = java.lang.Math.min(r8, r9);
        r13 = r6.a;
        r14 = r6.j;
        r13 = r13 - r14;
        r11 = java.lang.Math.min(r11, r13);
        r13 = r13 - r11;
        r8 = java.lang.Math.min(r8, r13);
        r17 = r9;
        r9 = r8;
        r8 = r17;
        goto L_0x03e7;
    L_0x03e4:
        r11 = r9;
        r8 = 0;
    L_0x03e6:
        r9 = 0;
    L_0x03e7:
        r13 = r6.getResources();
        r13 = r13.getDisplayMetrics();
        r14 = r6.getWidth();
        r15 = r6.getHeight();
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter.a(r13, r3);
        r6.k = r12;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r16 = com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter.a(r13, r12);
        r4 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r4 = com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter.a(r13, r4);
        r13 = com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter.a(r13, r12);
        r3 = r6.v;
        r15 = (float) r15;
        r15 = r15 - r13;
        r15 = r15 / r12;
        r3.top = r15;
        r3 = r6.v;
        r12 = r3.top;
        r12 = r12 + r13;
        r3.bottom = r12;
        r3 = r8 + r11;
        r3 = r3 + r9;
        r12 = r3;
    L_0x0421:
        r13 = r6.l;
        r15 = r13.length;
        if (r12 >= r15) goto L_0x042f;
    L_0x0426:
        r13[r12] = r5;
        r13 = r6.m;
        r13[r12] = r5;
        r12 = r12 + 1;
        goto L_0x0421;
    L_0x042f:
        r12 = 0;
        r13 = 0;
    L_0x0431:
        if (r12 >= r8) goto L_0x0441;
    L_0x0433:
        r15 = r6.l;
        r15[r12] = r13;
        r13 = r13 + r4;
        r15 = r6.m;
        r15[r12] = r13;
        r13 = r13 + r16;
        r12 = r12 + 1;
        goto L_0x0431;
    L_0x0441:
        r12 = (float) r14;
        r3 = r3 + -1;
        r14 = r12;
        r12 = r3;
        r3 = 0;
    L_0x0447:
        if (r3 >= r9) goto L_0x0459;
    L_0x0449:
        r15 = r6.m;
        r15[r12] = r14;
        r14 = r14 - r4;
        r15 = r6.l;
        r15[r12] = r14;
        r14 = r14 - r16;
        r3 = r3 + 1;
        r12 = r12 + -1;
        goto L_0x0447;
    L_0x0459:
        if (r11 <= 0) goto L_0x047b;
    L_0x045b:
        r14 = r14 - r13;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r14 = r14 + r3;
        r3 = r11 + -1;
        r3 = (float) r3;
        r3 = r3 * r16;
        r14 = r14 - r3;
        r3 = (float) r11;
        r14 = r14 / r3;
        r4 = r8;
        r3 = 0;
    L_0x0469:
        if (r3 >= r11) goto L_0x047b;
    L_0x046b:
        r9 = r6.l;
        r9[r4] = r13;
        r13 = r13 + r14;
        r9 = r6.m;
        r9[r4] = r13;
        r13 = r13 + r16;
        r3 = r3 + 1;
        r9 = 1;
        r4 = r4 + r9;
        goto L_0x0469;
    L_0x047b:
        r3 = r6.b;
        r8 = r8 + r3;
        r3 = r6.j;
        r8 = r8 - r3;
        r6.c = r8;
        r3 = r6.r;
        if (r3 == 0) goto L_0x04cf;
    L_0x0487:
        r3 = 0;
        r6.r = r3;
        r3 = r6.s;
        r4 = android.graphics.Paint.Style.FILL;
        r3.setStyle(r4);
        r3 = r6.s;
        r4 = r6.getResources();
        r8 = 2131559616; // 0x7f0d04c0 float:1.8744581E38 double:1.0531303783E-314;
        r4 = r4.getColor(r8);
        r3.setColor(r4);
        r3 = r6.t;
        r4 = android.graphics.Paint.Style.FILL;
        r3.setStyle(r4);
        r3 = r6.t;
        r4 = r6.getResources();
        r8 = 2131559617; // 0x7f0d04c1 float:1.8744583E38 double:1.053130379E-314;
        r4 = r4.getColor(r8);
        r3.setColor(r4);
        r3 = r6.u;
        r4 = android.graphics.Paint.Style.FILL;
        r3.setStyle(r4);
        r3 = r6.u;
        r4 = r6.getResources();
        r8 = 2131559624; // 0x7f0d04c8 float:1.8744597E38 double:1.0531303823E-314;
        r4 = r4.getColor(r8);
        r3.setColor(r4);
    L_0x04cf:
        if (r7 == 0) goto L_0x04d5;
    L_0x04d1:
        r3 = r6.j;
        r7 = r3 - r10;
    L_0x04d5:
        if (r7 != 0) goto L_0x04df;
    L_0x04d7:
        r3 = 0;
        r6.d = r3;
        r6.invalidate();
        goto L_0x052d;
    L_0x04df:
        r3 = r6.l;
        r3 = r3.length;
        r4 = 0;
    L_0x04e3:
        if (r4 >= r3) goto L_0x052a;
    L_0x04e5:
        r8 = r4 + r7;
        if (r8 >= 0) goto L_0x04ea;
    L_0x04e9:
        goto L_0x051f;
    L_0x04ea:
        if (r8 >= r3) goto L_0x051f;
    L_0x04ec:
        r9 = r6.n;
        r9 = r9[r8];
        r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r10 != 0) goto L_0x04fc;
    L_0x04f4:
        r10 = r6.o;
        r10 = r10[r8];
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 == 0) goto L_0x051f;
    L_0x04fc:
        r10 = r6.l;
        r10 = r10[r4];
        r11 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r11 != 0) goto L_0x050c;
    L_0x0504:
        r11 = r6.m;
        r11 = r11[r4];
        r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r11 == 0) goto L_0x051f;
    L_0x050c:
        r11 = r6.p;
        r10 = r10 - r9;
        r11[r4] = r10;
        r9 = r6.q;
        r10 = r6.m;
        r10 = r10[r4];
        r11 = r6.o;
        r8 = r11[r8];
        r10 = r10 - r8;
        r9[r4] = r10;
        goto L_0x0527;
    L_0x051f:
        r8 = r6.p;
        r8[r4] = r5;
        r8 = r6.q;
        r8[r4] = r5;
    L_0x0527:
        r4 = r4 + 1;
        goto L_0x04e3;
    L_0x052a:
        r6.a();
    L_0x052d:
        if (r1 == 0) goto L_0x053a;
    L_0x052f:
        r3 = r1.f;
        r4 = defpackage.awyt.class;
        r3 = defpackage.ajzv.a(r3, r4);
        r3 = (defpackage.awyt) r3;
        goto L_0x053b;
    L_0x053a:
        r3 = 0;
    L_0x053b:
        if (r3 == 0) goto L_0x053f;
    L_0x053d:
        r4 = 1;
        goto L_0x0540;
    L_0x053f:
        r4 = 0;
    L_0x0540:
        if (r4 != 0) goto L_0x0543;
    L_0x0542:
        goto L_0x055b;
    L_0x0543:
        r5 = r3.a;
        r5 = r5 & 64;
        if (r5 == 0) goto L_0x055b;
    L_0x0549:
        if (r2 == 0) goto L_0x055b;
    L_0x054b:
        r2 = r0.x;
        r2 = r2.t();
        r5 = new acvs;
        r6 = r3.g;
        r5.<init>(r6);
        r2.b(r5);
    L_0x055b:
        r2 = r0.p;
        r2.a(r3);
        r2 = r0.q;
        defpackage.xpr.a(r2, r4);
        r2 = r0.r;
        r2 = r2.getVisibility();
        if (r2 == 0) goto L_0x0572;
    L_0x056d:
        r2 = r0.r;
        defpackage.ggh.a(r2);
    L_0x0572:
        r2 = r0.c;
        r2.a();
        if (r1 == 0) goto L_0x057c;
    L_0x0579:
        r3 = r1.m;
        goto L_0x057d;
    L_0x057c:
        r3 = 0;
    L_0x057d:
        r1 = 2131758141; // 0x7f100c3d float:1.9147238E38 double:1.0532284627E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.FrameLayout) r1;
        r2 = r0.k;
        r2.a();
        r1.removeAllViews();
        if (r3 != 0) goto L_0x0598;
    L_0x0590:
        r2 = r2.f;
        if (r2 == 0) goto L_0x0597;
    L_0x0594:
        r1.removeView(r2);
    L_0x0597:
        return;
    L_0x0598:
        r2.g = r3;
        r4 = new gpu;
        r5 = r2.c;
        r4.<init>(r5);
        r2.f = r4;
        r4 = r2.f;
        r1.addView(r4);
        r1 = r3.a;
        r1 = r1.iterator();
    L_0x05ae:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x05c8;
    L_0x05b4:
        r3 = r1.next();
        r3 = (defpackage.awgc) r3;
        r3 = defpackage.gpt.a(r3);
        if (r3 == 0) goto L_0x05ae;
    L_0x05c0:
        r4 = r3.a;
        r5 = 1;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x05ae;
    L_0x05c6:
        r1 = 0;
        goto L_0x05ca;
    L_0x05c8:
        r1 = 0;
        r3 = 0;
    L_0x05ca:
        r1 = r2.a(r1, r3);
        r3 = 0;
        r1.setLayoutDirection(r3);
        r3 = 4;
        r1.setVisibility(r3);
        r3 = r2.f;
        r3.addView(r1);
        r3 = new gpw;
        r3.<init>(r2, r1);
        r2.h = r3;
        r1 = r2.f;
        r1 = r1.getViewTreeObserver();
        r2 = r2.h;
        r1.addOnGlobalLayoutListener(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpa.a(ajzq, boolean):void");
    }

    public final void g() {
        CharSequence charSequence;
        this.s.setImageResource(!this.j.c() ? R.drawable.quantum_ic_play_arrow_white_36 : R.drawable.quantum_ic_pause_white_36);
        ImageView imageView = this.s;
        if (this.j.c()) {
            charSequence = this.w;
        } else {
            charSequence = this.v;
        }
        imageView.setContentDescription(charSequence);
    }

    public final void h() {
        gov gov = this.m;
        if (gov != null) {
            gov.a();
        }
        gpo gpo = this.n;
        if (gpo != null) {
            eso eso = gpo.d;
            if (eso != null) {
                eso.a();
            }
        }
        gnz gnz = this.o;
        if (gnz != null) {
            gnz.a();
        }
    }

    public final void c() {
        if (this.b.f(true) != 1) {
            this.u.setAnimationListener(new gpk(this.h));
            this.h.clearAnimation();
            this.h.startAnimation(this.u);
        }
    }

    public final void d() {
        if (this.b.a(false, true) == 2) {
            this.u.setAnimationListener(new gpk(this.i));
            this.i.clearAnimation();
            this.i.startAnimation(this.u);
        }
    }

    public final void e() {
        gph gph = this.l;
        if (gph != null) {
            gph.X();
        }
    }

    public final boolean f() {
        gov gov = this.m;
        ajzp ajzp = gov.h;
        boolean z = false;
        if (ajzp != null) {
            aphg aphg = (aphg) ajzv.a(ajzp.l, aphg.class);
            if (aphg == null) {
                aphg = (aphg) ajzv.a(gov.h.k, aphg.class);
            }
            if (aphg != null) {
                aaas aaas = gov.c;
                apxu apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
                if ((aphg.a & 262144) == 0) {
                    z = true;
                } else {
                    gov.b.t().a(65, new acvs(aphg.r.d()), null);
                    return true;
                }
            }
        }
        return z;
    }
}
