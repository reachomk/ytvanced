package com.google.android.libraries.youtube.account.photo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ads;
import defpackage.aej;
import defpackage.akkv;
import defpackage.xtl;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CropActivity extends aej implements OnLayoutChangeListener, OnTouchListener {
    private PointF A = new PointF();
    private PointF B = new PointF();
    private double C = 1.0d;
    private float[] D = new float[9];
    private boolean E = true;
    private boolean F = true;
    private int G;
    private Uri g;
    private Uri h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private CharSequence p;
    private Pair q;
    private int r;
    private int s;
    private Matrix t;
    private Rect u;
    private ImageView v;
    private View w;
    private View x;
    private View y;
    private Matrix z;

    private static double a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return Math.sqrt((double) ((x * x) + (y * y)));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_crop);
        this.t = new Matrix();
        this.z = new Matrix();
        this.G = 0;
        Intent intent = getIntent();
        String str = "Image file not found";
        if (intent == null || intent.getExtras() == null) {
            xtl.c("Input for CropActivity is missing");
            setResult(1);
            finish();
        } else {
            this.h = intent.getData();
            Bundle extras = intent.getExtras();
            this.g = (Uri) extras.getParcelable("output");
            this.i = extras.getInt("widthRatio", 0);
            this.j = extras.getInt("heightRatio", 0);
            this.k = extras.getInt("minWidth", 0);
            this.l = extras.getInt("minHeight", 0);
            this.m = extras.getInt("visualWidthRatio", this.i);
            this.n = extras.getInt("visualHeightRatio", this.j);
            this.o = extras.getInt("visualDoubleWidthRatio", this.m);
            this.p = extras.getCharSequence("cropInfo");
            int i = this.i;
            if (i > 0) {
                int i2 = this.j;
                if (i2 > 0) {
                    if (this.m < this.o) {
                        xtl.c("A double mask width ratio must be smaller or equal to a single mask width ratio");
                        setResult(1);
                        finish();
                    } else {
                        int i3 = this.k;
                        if (i3 > 0) {
                            int i4 = this.l;
                            if (i4 > 0 && (i3 * i2) - (i4 * i) != 0) {
                                xtl.c("Min width and height must match the given width and height ratio");
                                setResult(1);
                                finish();
                            }
                        }
                        try {
                            this.q = akkv.a(getContentResolver(), this.h);
                            if (this.k > ((Integer) this.q.first).intValue() || this.l > ((Integer) this.q.second).intValue()) {
                                i = this.k;
                                i2 = this.l;
                                StringBuilder stringBuilder = new StringBuilder(69);
                                stringBuilder.append("Selected image is too small. Must be at least ");
                                stringBuilder.append(i);
                                stringBuilder.append("x");
                                stringBuilder.append(i2);
                                xtl.c(stringBuilder.toString());
                                setResult(2);
                                finish();
                            }
                        } catch (FileNotFoundException e) {
                            xtl.a(str, e);
                            setResult(1);
                            finish();
                        }
                    }
                }
            }
            xtl.c("Width and height ratio must be positive");
            setResult(1);
            finish();
        }
        if (!isFinishing()) {
            this.v = (ImageView) a((ImageView) findViewById(R.id.image));
            this.w = findViewById(R.id.crop_rectangle);
            this.x = findViewById(R.id.crop_left_mask);
            this.y = findViewById(R.id.crop_right_mask);
            try {
                Bitmap b = akkv.b(getContentResolver(), this.h);
                this.r = b.getWidth();
                this.s = b.getHeight();
                this.v.setImageBitmap(b);
                this.v.setOnTouchListener(this);
                this.v.addOnLayoutChangeListener(this);
                CharSequence charSequence = this.p;
                if (charSequence != null && charSequence.length() > 0) {
                    TextView textView = (TextView) a((TextView) findViewById(R.id.crop_info));
                    textView.setVisibility(0);
                    textView.setText(this.p);
                }
            } catch (FileNotFoundException e2) {
                xtl.a(str, e2);
                setResult(1);
                finish();
            }
            if (!isFinishing()) {
                ads g = g();
                if (g != null) {
                    g.g();
                    g.b(true);
                    g.a(false);
                    g.b();
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0018, code skipped:
            if (r1 != 6) goto L_0x00cd;
     */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
        r9 = this;
        r0 = r10;
        r0 = (android.widget.ImageView) r0;
        r1 = r11.getAction();
        r1 = r1 & 255;
        r2 = 1;
        if (r1 == 0) goto L_0x00b7;
    L_0x000c:
        r3 = 0;
        if (r1 == r2) goto L_0x00b1;
    L_0x000f:
        r4 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r6 = 2;
        if (r1 == r6) goto L_0x004c;
    L_0x0014:
        r7 = 5;
        if (r1 == r7) goto L_0x001c;
    L_0x0017:
        r11 = 6;
        if (r1 == r11) goto L_0x00b1;
    L_0x001a:
        goto L_0x00cd;
    L_0x001c:
        r7 = a(r11);
        r9.C = r7;
        r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r10 <= 0) goto L_0x00cd;
    L_0x0026:
        r10 = r9.z;
        r1 = r9.t;
        r10.set(r1);
        r10 = r9.B;
        r1 = r11.getX(r3);
        r4 = r11.getX(r2);
        r1 = r1 + r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 / r4;
        r3 = r11.getY(r3);
        r11 = r11.getY(r2);
        r3 = r3 + r11;
        r3 = r3 / r4;
        r10.set(r1, r3);
        r9.G = r6;
        goto L_0x00cd;
    L_0x004c:
        r10 = r9.G;
        if (r10 != r2) goto L_0x006f;
    L_0x0050:
        r10 = r9.t;
        r1 = r9.z;
        r10.set(r1);
        r10 = r9.t;
        r1 = r11.getX();
        r3 = r9.A;
        r3 = r3.x;
        r1 = r1 - r3;
        r11 = r11.getY();
        r3 = r9.A;
        r3 = r3.y;
        r11 = r11 - r3;
        r10.postTranslate(r1, r11);
        goto L_0x00ad;
    L_0x006f:
        if (r10 != r6) goto L_0x00ad;
    L_0x0071:
        r10 = a(r11);
        r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x00ad;
    L_0x0079:
        r3 = r9.C;
        r10 = r10 / r3;
        r3 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x0087;
    L_0x0082:
        r1 = r9.E;
        if (r1 == 0) goto L_0x0087;
    L_0x0086:
        goto L_0x008f;
    L_0x0087:
        r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x00ad;
    L_0x008b:
        r1 = r9.F;
        if (r1 == 0) goto L_0x00ad;
    L_0x008f:
        r1 = r9.t;
        r5 = r9.z;
        r1.set(r5);
        r1 = (float) r10;
        r5 = r9.t;
        r6 = r9.B;
        r6 = r6.x;
        r7 = r9.B;
        r7 = r7.y;
        r5.postScale(r1, r1, r6, r7);
        r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r1 < 0) goto L_0x00ab;
    L_0x00a8:
        r9.E = r2;
        goto L_0x00ad;
    L_0x00ab:
        r9.F = r2;
    L_0x00ad:
        r9.l();
        goto L_0x00cd;
    L_0x00b1:
        r9.G = r3;
        r10.performClick();
        goto L_0x00cd;
    L_0x00b7:
        r10 = r9.z;
        r1 = r9.t;
        r10.set(r1);
        r10 = r9.A;
        r1 = r11.getX();
        r11 = r11.getY();
        r10.set(r1, r11);
        r9.G = r2;
    L_0x00cd:
        r10 = r9.t;
        r0.setImageMatrix(r10);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.account.photo.CropActivity.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Rect rect = new Rect(i, i2, i3, i4);
        rect.sort();
        i = (int) getResources().getDimension(R.dimen.crop_rectangle_margin);
        i2 = rect.width() - i;
        i3 = rect.height() - i;
        if (i2 > 0 && i3 > 0) {
            double d = (double) i2;
            double d2 = (double) i3;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = (double) this.m;
            double d5 = (double) this.n;
            Double.isNaN(d4);
            Double.isNaN(d5);
            d4 /= d5;
            if (d3 > d4) {
                Double.isNaN(d2);
                i2 = (int) (d2 * d4);
            } else if (d3 < d4) {
                Double.isNaN(d);
                i3 = (int) (d / d4);
            }
            LayoutParams layoutParams = this.w.getLayoutParams();
            layoutParams.height = i3;
            layoutParams.width = i2;
            this.w.setLayoutParams(layoutParams);
            this.w.setVisibility(0);
            i = this.o;
            if (((float) i) > 0.0f && this.m > i) {
                i = (i2 - ((i * i3) / this.n)) / 2;
                LayoutParams layoutParams2 = this.x.getLayoutParams();
                layoutParams2.width = i;
                this.x.setLayoutParams(layoutParams2);
                this.x.setVisibility(0);
                layoutParams2 = this.y.getLayoutParams();
                layoutParams2.width = i;
                this.y.setLayoutParams(layoutParams2);
                this.y.setVisibility(0);
            }
            i = this.i;
            i4 = this.j;
            double d6 = (double) i;
            double d7 = (double) i4;
            Double.isNaN(d6);
            Double.isNaN(d7);
            d6 /= d7;
            if (d6 > d4) {
                i2 = (i * i3) / i4;
            } else if (d6 < d4) {
                i3 = (i4 * i2) / i;
            }
            i2 /= 2;
            i3 /= 2;
            this.u = new Rect(rect.centerX() - i2, rect.centerY() - i3, rect.centerX() + i2, rect.centerY() + i3);
            l();
            this.v.setImageMatrix(this.t);
            return;
        }
        xtl.c("Crop rectangle width and height must be positive.");
        setResult(1);
        finish();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_menu, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.crop_menu_save) {
            int i;
            Rect n = n();
            int width = n.width();
            int height = n.height();
            if (width > ((Integer) this.q.first).intValue() || height > ((Integer) this.q.second).intValue()) {
                width = ((Integer) this.q.first).intValue();
                height = ((Integer) this.q.second).intValue();
            } else {
                i = this.k;
                if (i > 0 && this.l > 0) {
                    double d = (double) (width - i);
                    double d2 = (double) i;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double abs = Math.abs(d / d2);
                    int i2 = this.k;
                    if (i2 > width || this.l > height || abs <= 0.019999999552965164d) {
                        height = this.l;
                        width = i2;
                    }
                }
            }
            width = Math.min(height, (Math.min(width, (this.i * height) / this.j) * this.j) / this.i);
            n.set(n.left, n.top, n.left + ((this.i * width) / this.j), n.top + width);
            width = n.left < 0 ? -n.left : n.right > ((Integer) this.q.first).intValue() ? ((Integer) this.q.first).intValue() - n.right : 0;
            i = n.top < 0 ? -n.top : n.bottom > ((Integer) this.q.second).intValue() ? ((Integer) this.q.second).intValue() - n.bottom : 0;
            n.offset(width, i);
            Bitmap bitmap = null;
            try {
                bitmap = akkv.a(getContentResolver(), this.h, n, this.k, this.l);
                bitmap.compress(CompressFormat.JPEG, 90, new FileOutputStream(this.g.getPath()));
                Intent intent = new Intent();
                intent.setData(this.g);
                setResult(-1, intent);
                bitmap.recycle();
                finish();
            } catch (IOException e) {
                xtl.a("IOException saving cropped file", e);
                setResult(0);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                finish();
            } catch (Throwable th) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                finish();
            }
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100 A:{SKIP} */
    private final void l() {
        /*
        r13 = this;
        r0 = r13.m();
        r1 = r13.k;
        r2 = 0;
        r3 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        if (r1 > 0) goto L_0x000f;
    L_0x000b:
        r1 = r13.l;
        if (r1 <= 0) goto L_0x005c;
    L_0x000f:
        r1 = r13.n();
        r5 = r13.k;
        r6 = r1.width();
        if (r5 < r6) goto L_0x002d;
    L_0x001b:
        r5 = r13.k;
        r5 = (double) r5;
        r7 = r1.width();
        r7 = (double) r7;
        java.lang.Double.isNaN(r5);
        java.lang.Double.isNaN(r7);
        r5 = r5 / r7;
        r13.F = r2;
        goto L_0x002e;
    L_0x002d:
        r5 = r3;
    L_0x002e:
        r7 = r13.l;
        r8 = r1.height();
        if (r7 < r8) goto L_0x004b;
    L_0x0036:
        r7 = r13.l;
        r7 = (double) r7;
        r1 = r1.height();
        r9 = (double) r1;
        java.lang.Double.isNaN(r7);
        java.lang.Double.isNaN(r9);
        r7 = r7 / r9;
        r5 = java.lang.Math.min(r5, r7);
        r13.F = r2;
    L_0x004b:
        r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x005c;
    L_0x004f:
        r1 = r13.E;
        if (r1 == 0) goto L_0x005c;
    L_0x0053:
        r0 = r13.t;
        a(r0, r5);
        r0 = r13.m();
    L_0x005c:
        r1 = r13.u;
        r1 = r1.width();
        r5 = r0.width();
        r6 = 1;
        if (r1 < r5) goto L_0x007f;
    L_0x0069:
        r1 = r13.u;
        r1 = r1.width();
        r7 = (double) r1;
        r1 = r0.width();
        r9 = (double) r1;
        java.lang.Double.isNaN(r7);
        java.lang.Double.isNaN(r9);
        r7 = r7 / r9;
        r13.E = r6;
        goto L_0x0080;
    L_0x007f:
        r7 = r3;
    L_0x0080:
        r1 = r13.u;
        r1 = r1.height();
        r5 = r0.height();
        if (r1 < r5) goto L_0x00a5;
    L_0x008c:
        r1 = r13.u;
        r1 = r1.height();
        r9 = (double) r1;
        r1 = r0.height();
        r11 = (double) r1;
        java.lang.Double.isNaN(r9);
        java.lang.Double.isNaN(r11);
        r9 = r9 / r11;
        r7 = java.lang.Math.max(r7, r9);
        r13.E = r6;
    L_0x00a5:
        r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x00b6;
    L_0x00a9:
        r1 = r13.F;
        if (r1 == 0) goto L_0x00b6;
    L_0x00ad:
        r0 = r13.t;
        a(r0, r7);
        r0 = r13.m();
    L_0x00b6:
        r1 = r13.u;
        r1 = r0.contains(r1);
        if (r1 != 0) goto L_0x0109;
    L_0x00be:
        r1 = r13.u;
        r1 = r1.left;
        r3 = r0.left;
        if (r1 >= r3) goto L_0x00ce;
    L_0x00c6:
        r1 = r13.u;
        r1 = r1.left;
        r3 = r0.left;
    L_0x00cc:
        r1 = r1 - r3;
        goto L_0x00de;
    L_0x00ce:
        r1 = r13.u;
        r1 = r1.right;
        r3 = r0.right;
        if (r1 <= r3) goto L_0x00dd;
    L_0x00d6:
        r1 = r13.u;
        r1 = r1.right;
        r3 = r0.right;
        goto L_0x00cc;
    L_0x00dd:
        r1 = 0;
    L_0x00de:
        r3 = r13.u;
        r3 = r3.top;
        r4 = r0.top;
        if (r3 >= r4) goto L_0x00ee;
    L_0x00e6:
        r2 = r13.u;
        r2 = r2.top;
        r0 = r0.top;
    L_0x00ec:
        r2 = r2 - r0;
        goto L_0x00fd;
    L_0x00ee:
        r3 = r13.u;
        r3 = r3.bottom;
        r4 = r0.bottom;
        if (r3 <= r4) goto L_0x00fd;
    L_0x00f6:
        r2 = r13.u;
        r2 = r2.bottom;
        r0 = r0.bottom;
        goto L_0x00ec;
    L_0x00fd:
        if (r1 == 0) goto L_0x0100;
    L_0x00ff:
        goto L_0x0102;
    L_0x0100:
        if (r2 == 0) goto L_0x0109;
    L_0x0102:
        r0 = r13.t;
        r1 = (float) r1;
        r2 = (float) r2;
        r0.postTranslate(r1, r2);
    L_0x0109:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.account.photo.CropActivity.l():void");
    }

    private final Rect m() {
        this.t.getValues(this.D);
        int ceil = (int) Math.ceil((double) this.D[2]);
        int ceil2 = (int) Math.ceil((double) this.D[5]);
        float[] fArr = this.D;
        double floor = Math.floor((double) ((fArr[0] * ((float) this.r)) + (fArr[3] * ((float) this.s))));
        float[] fArr2 = this.D;
        Rect rect = new Rect(ceil, ceil2, ((int) floor) + ceil, ((int) Math.floor((double) ((fArr2[4] * ((float) this.s)) + (fArr2[1] * ((float) this.r))))) + ceil2);
        rect.sort();
        return rect;
    }

    private final Rect n() {
        Rect rect = new Rect(this.u);
        Rect m = m();
        rect.offset(-m.left, -m.top);
        double intValue = (double) ((Integer) this.q.first).intValue();
        double width = (double) m.width();
        Double.isNaN(intValue);
        Double.isNaN(width);
        intValue /= width;
        width = (double) rect.left;
        Double.isNaN(width);
        int i = (int) (width * intValue);
        width = (double) rect.top;
        Double.isNaN(width);
        int i2 = (int) (width * intValue);
        double width2 = (double) rect.width();
        Double.isNaN(width2);
        int max = Math.max(1, (int) (width2 * intValue)) + i;
        double height = (double) rect.height();
        Double.isNaN(height);
        rect.set(i, i2, max, Math.max(1, (int) (height * intValue)) + i2);
        return rect;
    }

    private static void a(Matrix matrix, double d) {
        float f = (float) d;
        matrix.postScale(f, f);
    }

    private static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }
}
