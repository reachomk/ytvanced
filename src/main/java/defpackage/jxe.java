package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: jxe */
public final class jxe extends akpl {
    public final aaas a;
    public boolean b = false;
    private final Context c;
    private final akkq d;
    private final akou e;
    private final Resources f;
    private final LayoutInflater g;
    private final LinearLayout h;
    private final LinearLayout i;
    private FrameLayout j;
    private ImageView k;
    private TextView l;
    private LinearLayout m;
    private boolean n = false;
    private boolean o = false;
    private int p;
    private ajrm q;

    public jxe(Context context, akkq akkq, flu flu, aaas aaas) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.e = (akou) amqw.a((Object) flu);
        this.a = (aaas) amqw.a((Object) aaas);
        this.f = context.getResources();
        this.g = LayoutInflater.from(context);
        View inflate = this.g.inflate(R.layout.watch_card, null);
        this.h = (LinearLayout) inflate.findViewById(R.id.card_layout);
        this.i = (LinearLayout) inflate.findViewById(R.id.card_content);
        flu.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.e.a();
    }

    private final void c() {
        azik azik = this.q.c;
        if (azik != null && azik.c.size() != 0) {
            LinearLayout linearLayout;
            int a;
            if (!this.o) {
                CharSequence charSequence;
                this.g.inflate(R.layout.watch_card_section_title, this.i, true);
                linearLayout = this.i;
                TextView textView = (TextView) linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                azik azik2 = this.q.c;
                if (azik2 == null) {
                    charSequence = null;
                } else {
                    arml arml;
                    if ((azik2.a & 1) != 0) {
                        arml = azik2.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    charSequence = ajqy.a(arml);
                }
                textView.setText(charSequence);
                this.g.inflate(R.layout.watch_card_list_item_separator, this.i, true);
            }
            linearLayout = this.m;
            if (linearLayout == null) {
                this.m = new LinearLayout(this.c);
                this.m.setLayoutParams(new LayoutParams(-1, -2));
                this.m.setOrientation(0);
                a = xss.a(this.f.getDisplayMetrics(), 7);
                this.m.setPadding(a, a, a, a);
                this.i.addView(this.m);
            } else {
                linearLayout.removeAllViews();
            }
            a = this.f.getInteger(R.integer.watch_card_related_entities_count);
            this.m.setWeightSum((float) a);
            a = Math.min(a, this.q.c.c.size());
            for (int i = 0; i < a; i++) {
                arml arml2;
                apxu apxu;
                azim azim = (azim) this.q.c.c.get(i);
                View inflate = this.g.inflate(R.layout.watch_card_related_entity, null);
                TextView textView2 = (TextView) inflate.findViewById(R.id.title);
                if ((azim.a & 1) != 0) {
                    arml2 = azim.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                textView2.setText(ajqy.a(arml2));
                aygk aygk = azim.c;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                a(inflate, R.id.thumbnail, aygk);
                if ((azim.a & 4) != 0) {
                    apxu = azim.d;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                } else {
                    apxu = null;
                }
                inflate.setOnClickListener(new jxl(this, apxu));
                this.m.addView(inflate);
                inflate.setLayoutParams(new LayoutParams(0, -1, 1.0f));
            }
        }
    }

    public final void b() {
        int i;
        View findViewById;
        if (this.b) {
            if (!this.o) {
                LinearLayout linearLayout;
                int i2;
                TextView textView;
                ArrayList arrayList = new ArrayList();
                CharSequence charSequence = null;
                for (akbw akbw : this.q.d) {
                    aziw aziw = akbw.b;
                    if (aziw != null) {
                        arml arml;
                        if ((aziw.a & 1) != 0) {
                            arml = aziw.b;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        } else {
                            arml = null;
                        }
                        charSequence = ajqy.a(arml);
                        arrayList.addAll(aziw.c);
                    }
                }
                int size = arrayList.size();
                int i3 = R.id.title;
                if (size > 0) {
                    this.g.inflate(R.layout.watch_card_section_title, this.i, true);
                    linearLayout = this.i;
                    ((TextView) linearLayout.getChildAt(linearLayout.getChildCount() - 1)).setText(charSequence);
                    this.g.inflate(R.layout.watch_card_list_item_separator, this.i, true);
                    i2 = 0;
                    for (int i4 = 5; i2 < Math.min(i4, arrayList.size()); i4 = 5) {
                        arml arml2;
                        arml arml3;
                        if (i2 != 0) {
                            this.g.inflate(R.layout.watch_card_list_item_separator, this.i, true);
                        }
                        LinearLayout linearLayout2 = this.i;
                        aziu aziu = (aziu) arrayList.get(i2);
                        View inflate = this.g.inflate(R.layout.watch_card_video, null);
                        textView = (TextView) inflate.findViewById(i3);
                        if ((aziu.a & 4) != 0) {
                            arml2 = aziu.d;
                            if (arml2 == null) {
                                arml2 = arml.f;
                            }
                        } else {
                            arml2 = null;
                        }
                        textView.setText(ajqy.a(arml2));
                        TextView textView2 = (TextView) inflate.findViewById(R.id.duration);
                        if ((aziu.a & 8) != 0) {
                            arml3 = aziu.e;
                            if (arml3 == null) {
                                arml3 = arml.f;
                            }
                        } else {
                            arml3 = null;
                        }
                        textView2.setText(ajqy.a(arml3));
                        aygk aygk = aziu.b;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                        a(inflate, R.id.thumbnail, aygk);
                        inflate.findViewById(R.id.video_layout).setOnClickListener(new jxj(this, aziu));
                        linearLayout2.addView(inflate);
                        i2++;
                        i3 = R.id.title;
                    }
                }
                arrayList = new ArrayList();
                CharSequence charSequence2 = null;
                for (akbw akbw2 : this.q.d) {
                    azhm azhm = akbw2.a;
                    if (azhm != null) {
                        arml arml4;
                        if ((azhm.a & 1) != 0) {
                            arml4 = azhm.b;
                            if (arml4 == null) {
                                arml4 = arml.f;
                            }
                        } else {
                            arml4 = null;
                        }
                        charSequence2 = ajqy.a(arml4);
                        Collections.addAll(arrayList, (azhk[]) azhm.c.toArray(new azhk[0]));
                    }
                }
                if (arrayList.size() > 0) {
                    this.g.inflate(R.layout.watch_card_section_title, this.i, true);
                    LinearLayout linearLayout3 = this.i;
                    ((TextView) linearLayout3.getChildAt(linearLayout3.getChildCount() - 1)).setText(charSequence2);
                    this.g.inflate(R.layout.watch_card_list_item_separator, this.i, true);
                    for (i = 0; i < Math.min(5, arrayList.size()); i++) {
                        arml arml5;
                        if (i != 0) {
                            this.g.inflate(R.layout.watch_card_list_item_separator, this.i, true);
                        }
                        linearLayout = this.i;
                        azhk azhk = (azhk) arrayList.get(i);
                        View inflate2 = this.g.inflate(R.layout.watch_card_album, null);
                        textView = (TextView) inflate2.findViewById(R.id.title);
                        if ((azhk.a & 2) != 0) {
                            arml5 = azhk.c;
                            if (arml5 == null) {
                                arml5 = arml.f;
                            }
                        } else {
                            arml5 = null;
                        }
                        textView.setText(ajqy.a(arml5));
                        textView = (TextView) inflate2.findViewById(R.id.year);
                        if ((azhk.a & 4) != 0) {
                            arml5 = azhk.d;
                            if (arml5 == null) {
                                arml5 = arml.f;
                            }
                        } else {
                            arml5 = null;
                        }
                        textView.setText(ajqy.a(arml5));
                        aygk aygk2 = azhk.b;
                        if (aygk2 == null) {
                            aygk2 = aygk.f;
                        }
                        a(inflate2, R.id.thumbnail, aygk2);
                        inflate2.findViewById(R.id.album_layout).setOnClickListener(new jxi(this, azhk));
                        linearLayout.addView(inflate2);
                    }
                }
                c();
                this.o = true;
            }
            if (this.f.getConfiguration().orientation == 1) {
                this.l.setVisibility(4);
                findViewById = this.j.findViewById(R.id.card_switch_content);
                i = findViewById.getPaddingTop();
                findViewById.setPadding(i, i, i, 0);
            } else {
                this.h.findViewById(R.id.extra_padding).setVisibility(0);
            }
            this.k.setImageResource(R.drawable.arrows_collapse);
            this.i.setVisibility(0);
            return;
        }
        if (this.f.getConfiguration().orientation == 1) {
            this.l.setVisibility(0);
            findViewById = this.j.findViewById(R.id.card_switch_content);
            i = findViewById.getPaddingTop();
            findViewById.setPadding(i, i, i, i);
        } else {
            this.h.findViewById(R.id.extra_padding).setVisibility(8);
        }
        this.k.setImageResource(R.drawable.arrows_expand);
        this.i.setVisibility(8);
    }

    private final void a(View view, int i, aygk aygk) {
        ImageView imageView = (ImageView) view.findViewById(i);
        this.d.a(imageView, aygk);
        imageView.setVisibility(!aklb.a(aygk) ? 8 : 0);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        ajrm ajrm = (ajrm) obj;
        if (!ajrm.equals(this.q)) {
            this.n = false;
        }
        if (this.n && this.f.getConfiguration().orientation == this.p) {
            this.e.a(akor);
            return;
        }
        if (!this.n) {
            this.q = ajrm;
            this.b = this.q.e ^ 1;
        }
        if (this.h.findViewById(R.id.card_header) != null) {
            this.h.removeViewAt(0);
        }
        arml arml = null;
        this.h.addView((LinearLayout) this.g.inflate(R.layout.watch_card_header, null), 0);
        ((TextView) this.h.findViewById(R.id.card_title)).setText(ajqy.a(this.q.a));
        this.l = (TextView) this.h.findViewById(R.id.card_label);
        this.l.setText(ajqy.a(this.q.f));
        this.k = (ImageView) this.h.findViewById(R.id.card_switch_icon);
        this.j = (FrameLayout) this.h.findViewById(R.id.card_switch);
        this.j.setOnClickListener(new jxh(this));
        FrameLayout frameLayout = (FrameLayout) this.h.findViewById(R.id.call_to_action_layout);
        ((FixedAspectRatioRelativeLayout) this.h.findViewById(R.id.call_to_action_container)).a = this.f.getFraction(R.fraction.aspect_ratio_2_1, 1, 1);
        if (frameLayout.findViewById(R.id.watch_card_collage) == null) {
            ((ViewStub) frameLayout.findViewById(R.id.watch_card_collage_stub)).inflate();
        }
        azhs azhs = this.q.b;
        if (azhs != null && azhs.a == 49968063) {
            azhu azhu = (azhu) azhs.b;
            aygk aygk = azhu.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(frameLayout, R.id.left_thumbnail, aygk);
            aygk = azhu.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(frameLayout, R.id.top_right_thumbnail, aygk);
            aygk = azhu.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(frameLayout, R.id.bottom_right_thumbnail, aygk);
            TextView textView = (TextView) frameLayout.findViewById(R.id.call_to_action_button);
            if ((azhu.a & 16) != 0) {
                arml = azhu.f;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView.setText(ajqy.a(arml));
            frameLayout.setOnClickListener(new jxg(this, azhu));
        }
        if (this.n && this.o) {
            c();
        }
        b();
        this.n = true;
        int i = this.f.getConfiguration().orientation;
        this.p = i;
        if (i == 2) {
            LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            layoutParams.weight = 2.0f;
            frameLayout.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = (LayoutParams) this.j.getLayoutParams();
            layoutParams2.weight = 1.0f;
            this.j.setLayoutParams(layoutParams2);
        }
        this.e.a(akor);
    }
}
