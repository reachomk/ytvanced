package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* renamed from: kjl */
final class kjl extends akpl {
    public final View a;
    private final akkq b;
    private final fmx c;
    private final gax d;
    private final ImageView e = ((ImageView) this.a.findViewById(R.id.reel_channel_avatar));
    private ImageView f;
    private final YouTubeButton g = ((YouTubeButton) this.a.findViewById(R.id.reel_title));
    private apxu h;
    private final akko i;
    private ImageView j;
    private akle k;
    private aygk l;
    private gas m;

    public kjl(Context context, akkq akkq, aaas aaas, fmx fmx, akkl akkl, gax gax, int i) {
        this.b = akkq;
        this.c = fmx;
        this.d = gax;
        this.a = LayoutInflater.from(context).inflate(i, null);
        this.a.setOnClickListener(new kjk(this, gax, aaas));
        if (i == R.layout.reels_avatar_row_circular_item) {
            this.f = (ImageView) this.a.findViewById(R.id.reel_avatar_view_status);
        } else {
            this.j = (ImageView) this.a.findViewById(R.id.reel_video_avatar);
            this.k = new akle(new akkj(akkl), new xna(), this.j, true);
        }
        this.i = akko.h().a((int) R.drawable.missing_avatar).a();
    }

    public final void a(akor akor, awyw awyw) {
        aygk aygk;
        anxp anxp;
        arml arml;
        akkq akkq = this.b;
        ImageView imageView = this.e;
        aygk aygk2 = awyw.b;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        akkq.a(imageView, aygk2, this.i);
        this.m = (gas) akor.a("ReelToReelListDecorator");
        CharSequence charSequence = null;
        if ((awyw.a & 8) != 0) {
            gax gax = this.d;
            apxu apxu = awyw.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            int a = awwn.a(awyw.i);
            boolean z = false;
            if (a != 0 && a == 2) {
                z = true;
            }
            gax.a(2, apxu, z);
            this.d.a(this.a, new kjn(this, awyw));
            gax = this.d;
            apxu = awyw.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            apxu c = gax.c(apxu);
            if (c != null) {
                anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                c.a(access$000);
                if (c.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    c.a(access$000);
                    Object b = c.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    aygk = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b).f;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    if (aygk == null) {
                        anxp = awyw.e;
                        if (anxp == null) {
                            anxp = apxu.d;
                        }
                        access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        anxp.a(access$000);
                        if (anxp.h.a(access$000.d)) {
                            anxp = awyw.e;
                            if (anxp == null) {
                                anxp = apxu.d;
                            }
                            access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                            anxp.a(access$000);
                            b = anxp.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            aygk = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b).f;
                            if (aygk == null) {
                                aygk = aygk.f;
                            }
                        } else {
                            aygk = null;
                        }
                    }
                    if (aygk != null) {
                        int a2 = ReelWatchActivity.a(aygk);
                        this.b.a(aygk, ReelWatchActivity.b(aygk), a2);
                    }
                }
            }
        }
        int a3 = awwl.a(awyw.j);
        if (a3 != 0 && a3 == 2) {
            aygk = awyw.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            this.l = aygk;
            this.k.a(this.l);
        }
        YouTubeButton youTubeButton = this.g;
        if ((awyw.a & 4) != 0) {
            arml = awyw.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        youTubeButton.setText(ajqy.a(arml));
        youTubeButton = this.g;
        aodx aodx = awyw.g;
        if (aodx == null) {
            aodx = aodx.c;
        }
        aodv aodv = aodx.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        if ((2 & aodv.a) != 0) {
            aodx aodx2 = awyw.g;
            if (aodx2 == null) {
                aodx2 = aodx.c;
            }
            aodv aodv2 = aodx2.b;
            if (aodv2 == null) {
                aodv2 = aodv.c;
            }
            charSequence = aodv2.b;
        }
        youTubeButton.setContentDescription(charSequence);
        a(awyw);
        anxp = awyw.h;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(HintRendererOuterClass.hintRenderer);
        anxp.a(access$0002);
        if (anxp.h.a(access$0002.d)) {
            fmx fmx = this.c;
            anxp anxp2 = awyw.h;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0003 = anxl.checkIsLite(HintRendererOuterClass.hintRenderer);
            anxp2.a(access$0003);
            Object b2 = anxp2.h.b(access$0003.d);
            if (b2 == null) {
                b2 = access$0003.b;
            } else {
                b2 = access$0003.a(b2);
            }
            fmx.a((aruh) b2, this.a, awyw, akor.a);
        }
        apxu apxu2 = awyw.e;
        if (apxu2 == null) {
            apxu2 = apxu.d;
        }
        this.h = apxu2;
    }

    public final void a(awyw awyw) {
        int a;
        int a2 = awwn.a(awyw.i);
        if (a2 == 0 || a2 != 2) {
            gax gax = this.d;
            apxu apxu = awyw.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            if (!gax.d(apxu)) {
                a = awwl.a(awyw.j);
                if (a == 0 || a != 2) {
                    this.f.setEnabled(true);
                } else {
                    this.j.setAlpha(1.0f);
                }
                this.g.setAlpha(1.0f);
                return;
            }
        }
        a = awwl.a(awyw.j);
        if (a == 0 || a != 2) {
            this.f.setEnabled(false);
        } else {
            this.j.setAlpha(0.5f);
        }
        this.g.setAlpha(0.54f);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        gax gax = this.d;
        gax.b.remove(this.a);
        this.m = null;
        this.l = null;
    }
}
