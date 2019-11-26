package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import java.util.concurrent.Executor;

/* renamed from: acrn */
public final class acrn implements akot, OnClickListener {
    public final akkq a;
    public final abzv b;
    public final Handler c;
    private final Context d;
    private final akvp e;
    private final aaas f;
    private final Executor g;
    private final acrt h;
    private final View i;
    private final View j = this.i.findViewById(R.id.event_overlay);
    private final ImageButton k = ((ImageButton) this.i.findViewById(R.id.event_delete));

    public acrn(Context context, akkq akkq, akvp akvp, abzv abzv, aaas aaas, Executor executor, acrt acrt) {
        this.d = (Context) amqw.a((Object) context);
        this.c = new Handler(context.getMainLooper());
        this.a = (akkq) amqw.a((Object) akkq);
        this.e = (akvp) amqw.a((Object) akvp);
        this.b = (abzv) amqw.a((Object) abzv);
        this.f = (aaas) amqw.a((Object) aaas);
        this.g = (Executor) amqw.a((Object) executor);
        this.h = (acrt) amqw.a((Object) acrt);
        this.i = View.inflate(context, R.layout.lc_scheduled_stream_item, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.i;
    }

    public final void onClick(View view) {
        if (view == this.j && (view.getTag() instanceof apxu)) {
            this.f.a((apxu) view.getTag(), this.h.X());
        } else if (view == this.k && (view.getTag() instanceof aphg)) {
            apxu apxu;
            aphg aphg = (aphg) view.getTag();
            aaas aaas = this.f;
            if ((aphg.a & 4096) != 0) {
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            aaas.a(apxu, this.h.X());
        }
    }

    public static String a(auyq auyq) {
        anxp anxp = auyq.g;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = auyq.g;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aphg aphg = (aphg) b;
            anxp = aphg.l;
            if (anxp == null) {
                anxp = apxu.d;
            }
            access$000 = anxl.checkIsLite(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp2 = aphg.l;
                if (anxp2 == null) {
                    anxp2 = apxu.d;
                }
                access$0002 = anxl.checkIsLite(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
                anxp2.a(access$0002);
                b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) b;
                if ((deleteVideoEndpointOuterClass$DeleteVideoEndpoint.a & 1) != 0) {
                    return deleteVideoEndpointOuterClass$DeleteVideoEndpoint.b;
                }
            }
        }
        return null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        TextView textView;
        arml arml;
        arwf arwf;
        arwh a;
        auyq auyq = (auyq) obj;
        if ((auyq.a & 1) != 0) {
            textView = (TextView) this.i.findViewById(R.id.title);
            arml = auyq.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        textView = (TextView) this.i.findViewById(R.id.date);
        if ((auyq.a & 2) != 0) {
            arml = auyq.c;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        if ((auyq.a & 8) != 0) {
            arwf = auyq.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            int a2 = this.e.a(a);
            if (a2 != 0) {
                Resources resources = this.d.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lc_scheduled_event_date_drawable_dimensions);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(new BitmapDrawable(resources, Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, a2), dimensionPixelSize, dimensionPixelSize, true)), null, null, null);
            }
        }
        ImageView imageView = (ImageView) this.i.findViewById(R.id.event_thumbnail);
        if ((auyq.a & 16) != 0) {
            aygk aygk = auyq.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            this.g.execute(new acrq(this, auyq, xvt.d(aklb.f(aygk).b), imageView));
        }
        if ((auyq.a & 32) != 0) {
            this.j.setOnClickListener(this);
            View view = this.j;
            Object obj2 = auyq.f;
            if (obj2 == null) {
                obj2 = apxu.d;
            }
            view.setTag(obj2);
        }
        anxp anxp = auyq.g;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = auyq.g;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg aphg = (aphg) b;
            if ((aphg.a & 16384) != 0) {
                ImageButton imageButton = this.k;
                aodv aodv = aphg.p;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                imageButton.setContentDescription(aodv.b);
            }
            if ((aphg.a & 16) != 0) {
                akvp akvp = this.e;
                arwf = aphg.e;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                int a3 = akvp.a(a);
                if (a3 != 0) {
                    this.k.setImageDrawable(ra.a(this.d, a3));
                }
            }
            this.k.setTag(aphg);
            this.k.setOnClickListener(this);
        }
        int i = auyq.a;
    }
}
