package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kgc */
public final class kgc implements akot {
    public final aaas a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.upload_status_message));
    private final TextView e = ((TextView) this.b.findViewById(R.id.upload_status_detailed_message));
    private final ImageView f = ((ImageView) this.b.findViewById(R.id.thumbnail));
    private final ProgressBar g = ((ProgressBar) this.b.findViewById(R.id.transcoding_progressbar));
    private final ProgressBar h = ((ProgressBar) this.b.findViewById(R.id.upload_progressbar));
    private final ProgressBar i = ((ProgressBar) this.b.findViewById(R.id.processing_progressbar));
    private final RelativeLayout j = ((RelativeLayout) this.b.findViewById(R.id.thumbnail_layout));
    private final View k = this.b.findViewById(R.id.contextual_menu_anchor);
    private final khp l;
    private final Context m;
    private final akkq n;
    private final akou o;
    private final akvo p;

    public kgc(Context context, aaas aaas, akkq akkq, flu flu, akvo akvo) {
        this.m = (Context) amqw.a((Object) context);
        this.n = (akkq) amqw.a((Object) akkq);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = View.inflate(context, R.layout.pending_video_upload_item, null);
        this.l = new khp((ViewStub) this.b.findViewById(R.id.privacy_badge), context);
        this.o = (akou) amqw.a((Object) flu);
        this.p = (akvo) amqw.a((Object) akvo);
        flu.a(this.b);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.o.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akor akor2 = akor;
        fnp fnp = (fnp) obj;
        this.j.getLayoutParams().width = this.m.getResources().getDimensionPixelSize(R.dimen.list_item_thumbnail_width);
        this.c.setText(fnp.c);
        aygk aygk = fnp.f;
        if (aygk != null) {
            this.n.a(this.f, aygk);
            this.f.setScaleType(ScaleType.CENTER_CROP);
        } else if (fnp.g == null) {
            this.n.a(this.f);
            this.f.setImageResource(R.drawable.ic_unsupported_file_format);
            this.f.setScaleType(ScaleType.CENTER_CROP);
        } else {
            this.n.a(this.f);
            this.f.setImageBitmap(fnp.g);
            this.f.setScaleType(ScaleType.CENTER_INSIDE);
        }
        if (fnp.b) {
            apdu apdu = (apdu) apdv.c.createBuilder();
            awnx awnx = fnp.d;
            apdu.copyOnWrite();
            apdv apdv = (apdv) apdu.instance;
            if (awnx != null) {
                apdv.a |= 1;
                apdv.b = awnx.d;
                this.l.a((apdv) ((anxl) apdu.build()));
            } else {
                throw new NullPointerException();
            }
        }
        if (fnp.e == null) {
            this.k.setVisibility(8);
        } else {
            this.p.a(this.o.a(), this.k, fnp.e, fnp, akor2.a);
            this.k.setVisibility(0);
        }
        double d = fnp.i;
        int i = (int) (d * 100.0d);
        double d2 = fnp.j;
        int i2 = d2 > -1.0d ? (int) (d2 * 100.0d) : 0;
        int i3 = (int) (fnp.o * 100.0d);
        if (i3 > i2) {
            i3 = i2;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        this.g.setProgress(i);
        this.h.setProgress(i2);
        this.i.setProgress(i3);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        if (fnp.w) {
            this.d.setText(R.string.delete_inprogress_upload_failed);
            this.e.setText(null);
        } else if (fnp.v) {
            this.d.setText(R.string.upload_cancelling);
            this.e.setText(null);
        } else {
            Spanned spanned = fnp.r;
            if (spanned != null) {
                this.d.setText(spanned);
                this.e.setText(fnp.s);
            } else if (fnp.l) {
                this.d.setText(R.string.upload_transfer_failed);
                this.e.setText(R.string.upload_transfer_failed_details);
            } else if (fnp.m) {
                this.d.setText(R.string.upload_metadata_saving_failed);
                this.e.setText(R.string.upload_metadata_saving_failed_details);
            } else if (fnp.x) {
                this.d.setText(R.string.upload_failed);
                this.e.setText(null);
            } else if (d > -1.0d && d2 <= -1.0d) {
                this.g.setVisibility(0);
                this.d.setText(this.m.getResources().getQuantityString(R.plurals.transcoding_progress, i, new Object[]{Integer.valueOf(i)}));
                this.e.setText(null);
            } else if (d2 > -1.0d && fnp.j < 1.0d) {
                CharSequence string;
                this.h.setVisibility(0);
                this.i.setVisibility(0);
                this.d.setText(this.m.getResources().getQuantityString(R.plurals.upload_progress, i2, new Object[]{Integer.valueOf(i2)}));
                TextView textView = this.e;
                double d3 = fnp.k;
                if (!Double.isNaN(d3)) {
                    int i4;
                    if (Double.isInfinite(d3)) {
                        i4 = fnp.n;
                        string = i4 == 1 ? this.m.getResources().getString(R.string.upload_waiting_wifi) : i4 == 2 ? this.m.getResources().getString(R.string.upload_waiting_network) : this.m.getResources().getString(R.string.upload_transfer_pending);
                    } else {
                        i4 = (int) d3;
                        i3 = i4 / 60;
                        i = i3 / 60;
                        if (i4 > 1) {
                            if (i4 <= 90) {
                                string = this.m.getResources().getQuantityString(R.plurals.upload_seconds_remaing, i4, new Object[]{Integer.valueOf(i4)});
                            } else if (i3 <= 90) {
                                string = this.m.getResources().getQuantityString(R.plurals.upload_minutes_remaing, i3, new Object[]{Integer.valueOf(i3)});
                            } else if (i <= 3) {
                                string = this.m.getResources().getQuantityString(R.plurals.upload_hours_remaing, i, new Object[]{Integer.valueOf(i)});
                            }
                        }
                    }
                    textView.setText(string);
                }
                string = null;
                textView.setText(string);
            } else if (fnp.j != 1.0d) {
                this.d.setText(R.string.indeterminate_upload_progress);
                this.e.setText(null);
            } else {
                this.h.setVisibility(0);
                this.i.setVisibility(0);
                CharSequence charSequence = fnp.p;
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = new SpannedString(this.m.getString(R.string.upload_status_processing));
                }
                this.d.setText(charSequence);
                this.e.setText(fnp.q);
            }
        }
        apxu apxu = fnp.u;
        if (apxu == null) {
            apxu = fnp.t;
            if (apxu == null) {
                this.b.setOnClickListener(null);
                this.b.setClickable(false);
                this.b.setFocusable(true);
            } else {
                this.b.setOnClickListener(new kge(this, apxu));
            }
        } else {
            this.b.setOnClickListener(new kgf(this, apxu));
        }
        this.o.a(akor2);
    }
}
