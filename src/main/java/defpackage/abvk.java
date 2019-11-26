package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: abvk */
public final class abvk implements OnClickListener, xni {
    public final aaas a;
    private final ayvi b;
    private final Context c;
    private final akkl d;
    private final acvx e;
    private AlertDialog f;
    private ImageView g;
    private ImageView h;
    private FrameLayout i;
    private Button j;
    private Button k;
    private aphg l;
    private aphg m;

    public abvk(ayvi ayvi, Context context, akkl akkl, aaas aaas, acvx acvx) {
        this.b = (ayvi) amqw.a((Object) ayvi);
        this.c = (Context) amqw.a((Object) context);
        this.d = (akkl) amqw.a((Object) akkl);
        this.a = (aaas) amqw.a((Object) aaas);
        this.e = (acvx) amqw.a((Object) acvx);
    }

    public final void a() {
    }

    public final void c(ImageView imageView) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c1  */
    public final void b() {
        /*
        r9 = this;
        r0 = r9.b;
        r0 = r0.k;
        if (r0 == 0) goto L_0x01e7;
    L_0x0006:
        r0 = r9.c;
        r0 = android.view.LayoutInflater.from(r0);
        r1 = 2131034871; // 0x7f0502f7 float:1.7680272E38 double:1.05287112E-314;
        r2 = 0;
        r0 = r0.inflate(r1, r2);
        r1 = new android.app.AlertDialog$Builder;
        r3 = new android.view.ContextThemeWrapper;
        r4 = r9.c;
        r5 = 2132017564; // 0x7f14019c float:1.967341E38 double:1.0533566347E-314;
        r3.<init>(r4, r5);
        r1.<init>(r3);
        r1 = r1.create();
        r9.f = r1;
        r1 = 2131756544; // 0x7f100600 float:1.9143999E38 double:1.0532276737E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r9.g = r1;
        r1 = 2131755713; // 0x7f1002c1 float:1.9142313E38 double:1.053227263E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r9.h = r1;
        r1 = new akle;
        r3 = r9.d;
        r4 = r9.g;
        r1.<init>(r3, r4);
        r3 = new akle;
        r4 = r9.d;
        r5 = r9.h;
        r3.<init>(r4, r5);
        r4 = 2131757427; // 0x7f100973 float:1.914579E38 double:1.05322811E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r5 = 2131756597; // 0x7f100635 float:1.9144106E38 double:1.0532277E-314;
        r5 = r0.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r6 = 2131757428; // 0x7f100974 float:1.9145791E38 double:1.0532281104E-314;
        r6 = r0.findViewById(r6);
        r6 = (android.widget.FrameLayout) r6;
        r9.i = r6;
        r6 = 2131755516; // 0x7f1001fc float:1.9141913E38 double:1.053227166E-314;
        r6 = r0.findViewById(r6);
        r6 = (android.widget.Button) r6;
        r9.j = r6;
        r6 = 2131755767; // 0x7f1002f7 float:1.9142423E38 double:1.05322729E-314;
        r6 = r0.findViewById(r6);
        r6 = (android.widget.Button) r6;
        r9.k = r6;
        r6 = r9.b;
        r6 = r6.c;
        if (r6 != 0) goto L_0x008c;
    L_0x008a:
        r6 = defpackage.aygk.f;
    L_0x008c:
        r6 = defpackage.aklb.a(r6);
        r7 = 0;
        r8 = 8;
        if (r6 == 0) goto L_0x00a6;
    L_0x0095:
        r6 = r9.g;
        r6.setVisibility(r7);
        r6 = r9.b;
        r6 = r6.c;
        if (r6 != 0) goto L_0x00a2;
    L_0x00a0:
        r6 = defpackage.aygk.f;
    L_0x00a2:
        r1.a(r6, r9);
        goto L_0x00ae;
    L_0x00a6:
        r6 = r9.g;
        r6.setVisibility(r8);
        r1.b();
    L_0x00ae:
        r1 = r9.b;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00b6;
    L_0x00b4:
        r1 = defpackage.aygk.f;
    L_0x00b6:
        r1 = defpackage.aklb.a(r1);
        if (r1 == 0) goto L_0x00cd;
    L_0x00bc:
        r1 = r9.h;
        r1.setVisibility(r7);
        r1 = r9.b;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00c9;
    L_0x00c7:
        r1 = defpackage.aygk.f;
    L_0x00c9:
        r3.a(r1);
        goto L_0x00d5;
    L_0x00cd:
        r1 = r9.h;
        r1.setVisibility(r8);
        r3.b();
    L_0x00d5:
        r1 = r9.b;
        r3 = r1.a;
        r6 = r3 & 4096;
        if (r6 == 0) goto L_0x00f0;
    L_0x00dd:
        r3 = r3 & 4;
        if (r3 == 0) goto L_0x00e8;
    L_0x00e1:
        r1 = r1.d;
        if (r1 != 0) goto L_0x00e9;
    L_0x00e5:
        r1 = defpackage.arml.f;
        goto L_0x00e9;
    L_0x00e8:
        r1 = r2;
    L_0x00e9:
        r1 = defpackage.ajqy.a(r1);
        r4.setText(r1);
    L_0x00f0:
        r1 = r9.b;
        r3 = r1.a;
        r3 = r3 & r8;
        if (r3 == 0) goto L_0x0109;
    L_0x00f7:
        r1 = r1.e;
        if (r1 != 0) goto L_0x00fd;
    L_0x00fb:
        r1 = defpackage.arml.f;
    L_0x00fd:
        r3 = new abvn;
        r3.<init>(r9);
        r1 = defpackage.ajqy.a(r1, r3);
        r5.setText(r1);
    L_0x0109:
        r1 = r9.b;
        r3 = r1.a;
        r3 = r3 & 16;
        r4 = 1;
        if (r3 == 0) goto L_0x012d;
    L_0x0112:
        r1 = r1.f;
        if (r1 != 0) goto L_0x0118;
    L_0x0116:
        r1 = defpackage.aphj.d;
    L_0x0118:
        r1 = r1.a;
        r1 = r1 & r4;
        if (r1 != 0) goto L_0x011e;
    L_0x011d:
        goto L_0x012d;
    L_0x011e:
        r1 = r9.b;
        r1 = r1.f;
        if (r1 != 0) goto L_0x0126;
    L_0x0124:
        r1 = defpackage.aphj.d;
    L_0x0126:
        r1 = r1.b;
        if (r1 != 0) goto L_0x012e;
    L_0x012a:
        r1 = defpackage.aphg.s;
        goto L_0x012e;
    L_0x012d:
        r1 = r2;
    L_0x012e:
        r9.l = r1;
        r1 = r9.b;
        r3 = r1.a;
        r3 = r3 & 32;
        if (r3 == 0) goto L_0x0153;
    L_0x0138:
        r1 = r1.g;
        if (r1 != 0) goto L_0x013e;
    L_0x013c:
        r1 = defpackage.aphj.d;
    L_0x013e:
        r1 = r1.a;
        r1 = r1 & r4;
        if (r1 != 0) goto L_0x0144;
    L_0x0143:
        goto L_0x0153;
    L_0x0144:
        r1 = r9.b;
        r1 = r1.g;
        if (r1 != 0) goto L_0x014c;
    L_0x014a:
        r1 = defpackage.aphj.d;
    L_0x014c:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0154;
    L_0x0150:
        r1 = defpackage.aphg.s;
        goto L_0x0154;
    L_0x0153:
        r1 = r2;
    L_0x0154:
        r9.m = r1;
        r1 = r9.j;
        r3 = r9.l;
        r9.a(r1, r3);
        r1 = r9.k;
        r3 = r9.m;
        r9.a(r1, r3);
        r1 = r9.l;
        if (r1 != 0) goto L_0x0169;
    L_0x0168:
        goto L_0x019f;
    L_0x0169:
        r3 = r1.b;
        if (r3 != r4) goto L_0x019f;
    L_0x016d:
        r1 = r1.c;
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r1 = defpackage.aphh.a(r1);
        if (r1 == 0) goto L_0x019f;
    L_0x017b:
        r3 = 3;
        if (r1 != r3) goto L_0x019f;
    L_0x017e:
        r1 = r9.c;
        r1 = r1.getResources();
        r3 = r9.i;
        r3 = r3.getLayoutParams();
        r3 = (android.widget.LinearLayout.LayoutParams) r3;
        r4 = 2131625534; // 0x7f0e063e float:1.8878279E38 double:1.053162946E-314;
        r4 = r1.getDimensionPixelOffset(r4);
        r3.setMarginEnd(r4);
        r4 = 2131625533; // 0x7f0e063d float:1.8878277E38 double:1.0531629457E-314;
        r1 = r1.getDimensionPixelOffset(r4);
        r3.bottomMargin = r1;
    L_0x019f:
        r1 = r9.f;
        r1.setView(r0);
        r0 = r9.f;
        r0.show();
        r0 = r9.e;
        r1 = r9.b;
        r1 = r1.h;
        r1 = r1.d();
        r0.a(r1, r2);
        r0 = r9.b;
        r0 = r0.j;
        r0 = r0.size();
        if (r0 != 0) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01e7;
    L_0x01c1:
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = r9.b;
        r2 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r0.put(r2, r1);
        r1 = r9.b;
        r1 = r1.j;
        r1 = r1.iterator();
    L_0x01d5:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x01e7;
    L_0x01db:
        r2 = r1.next();
        r2 = (defpackage.apxu) r2;
        r3 = r9.a;
        r3.a(r2, r0);
        goto L_0x01d5;
    L_0x01e7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvk.b():void");
    }

    private final void a(Button button, aphg aphg) {
        if (aphg != null) {
            int a;
            if ((aphg.a & 128) != 0) {
                arml arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
                button.setText(ajqy.a(arml));
            }
            int i = 1;
            if (aphg.b == 1) {
                a = aphh.a(((Integer) aphg.c).intValue());
                if (a != 0) {
                    i = a;
                }
            }
            a = i - 1;
            if (i != 0) {
                if (a == 2) {
                    button.setBackground(ra.a(this.c, (int) R.drawable.live_chat_dialog_button_style_primary));
                    button.setTextColor(xwe.a(this.c, R.attr.ytStaticWhite, 0));
                } else if (a == 13) {
                    button.setBackgroundColor(0);
                    xpr.a((View) button, button.getBackground());
                    button.setTextColor(ra.c(this.c, R.color.live_chat_dialog_button_style_blue_text_color));
                }
                button.setOnClickListener(this);
                button.setVisibility(0);
                return;
            }
            throw null;
        }
        button.setVisibility(8);
    }

    public final void onClick(View view) {
        aphg aphg;
        if (view == this.j) {
            aphg = this.l;
        } else if (view == this.k) {
            aphg = this.m;
        } else {
            aphg = null;
        }
        if (aphg != null) {
            Map a = amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", aphg);
            int i = aphg.a;
            aaas aaas;
            apxu apxu;
            apxu apxu2;
            acvx acvx;
            if ((i & 4096) != 0) {
                apxu apxu3 = aphg.m;
                if (apxu3 == null) {
                    apxu3 = apxu.d;
                }
                this.a.a(apxu3, a);
                anxr access$000 = anxl.checkIsLite(avjd.b);
                apxu3.a(access$000);
                if (!apxu3.h.a(access$000.d)) {
                    aphf aphf = (aphf) ((anxo) aphg.toBuilder());
                    aphf.b(this.e.a(apxu3));
                    aphg = (aphg) ((anxl) aphf.build());
                }
            } else if ((i & 2048) != 0) {
                aaas = this.a;
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, a);
                apxu2 = aphg.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                if ((apxu2.a & 1) != 0) {
                    acvx = this.e;
                    apxu = aphg.l;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    acvx.a(3, new acvs(apxu.b), null);
                }
            } else if ((i & 8192) != 0) {
                aaas = this.a;
                apxu = aphg.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, a);
                apxu2 = aphg.n;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                if ((apxu2.a & 1) != 0) {
                    acvx = this.e;
                    apxu = aphg.n;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    acvx.a(3, new acvs(apxu.b), null);
                }
            }
            this.f.dismiss();
            if (view == this.j) {
                this.l = aphg;
            } else if (view == this.k) {
                this.m = aphg;
            }
        }
    }

    public final void a(ImageView imageView) {
        ImageView imageView2 = this.g;
        if (imageView == imageView2) {
            Drawable drawable = imageView2.getDrawable();
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int width = (this.g.getWidth() - this.g.getPaddingLeft()) - this.g.getPaddingRight();
                int height = (this.g.getHeight() - this.g.getPaddingTop()) - this.g.getPaddingBottom();
                Matrix matrix = new Matrix(this.g.getMatrix());
                float f = intrinsicWidth * height > width * intrinsicHeight ? ((float) height) / ((float) intrinsicHeight) : ((float) width) / ((float) intrinsicWidth);
                matrix.setScale(f, f);
                this.g.setScaleType(ScaleType.MATRIX);
                this.g.setImageMatrix(matrix);
            }
        }
    }

    public final void b(ImageView imageView) {
        ImageView imageView2 = this.g;
        if (imageView == imageView2) {
            imageView2.setVisibility(8);
            this.h.setVisibility(8);
        }
    }
}
