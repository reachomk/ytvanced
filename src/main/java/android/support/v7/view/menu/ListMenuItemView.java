package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.afy;
import defpackage.aja;
import defpackage.ajo;
import defpackage.arz;

public class ListMenuItemView extends LinearLayout implements ajo, SelectionBoundsAdjuster {
    public aja a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public final boolean b() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        arz a = arz.a(getContext(), attributeSet, afy.bB, i, 0);
        this.m = a.a(afy.bC);
        this.n = a.f(afy.bD, -1);
        this.c = a.a(afy.bE, false);
        this.o = context;
        this.p = a.a(afy.bF);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        a.a();
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        abe.a((View) this, this.m);
        this.h = (TextView) findViewById(R.id.title);
        int i = this.n;
        if (i != -1) {
            this.h.setTextAppearance(this.o, i);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        this.k = (ImageView) findViewById(R.id.submenuarrow);
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    public final void a(aja aja) {
        this.a = aja;
        int i = 0;
        setVisibility(!aja.isVisible() ? 8 : 0);
        CharSequence a = aja.a((ajo) this);
        if (a != null) {
            this.h.setText(a);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = aja.isCheckable();
        if (!(!isCheckable && this.g == null && this.i == null)) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            CheckBox checkBox;
            if (this.a.e()) {
                if (this.g == null) {
                    this.g = (RadioButton) c().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    a(this.g);
                }
                CompoundButton compoundButton3 = this.g;
                compoundButton = this.i;
                compoundButton2 = compoundButton3;
                checkBox = compoundButton;
            } else {
                if (this.i == null) {
                    this.i = (CheckBox) c().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    a(this.i);
                }
                checkBox = this.i;
                compoundButton = this.g;
                compoundButton2 = checkBox;
            }
            if (isCheckable) {
                compoundButton2.setChecked(this.a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.g;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
        isCheckable = aja.d();
        aja.c();
        int i2 = (isCheckable && this.a.d()) ? 0 : 8;
        if (i2 == 0) {
            CharSequence charSequence;
            TextView textView = this.j;
            aja aja2 = this.a;
            char c = aja2.c();
            if (c == 0) {
                charSequence = "";
            } else {
                Resources resources = aja2.i.a.getResources();
                StringBuilder stringBuilder = new StringBuilder();
                if (ViewConfiguration.get(aja2.i.a).hasPermanentMenuKey()) {
                    stringBuilder.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = !aja2.i.d() ? aja2.f : aja2.h;
                aja.a(stringBuilder, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                aja.a(stringBuilder, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                aja.a(stringBuilder, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                aja.a(stringBuilder, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                aja.a(stringBuilder, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                aja.a(stringBuilder, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c == 8) {
                    stringBuilder.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == 10) {
                    stringBuilder.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    stringBuilder.append(c);
                } else {
                    stringBuilder.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                charSequence = stringBuilder.toString();
            }
            textView.setText(charSequence);
        }
        if (this.j.getVisibility() != i2) {
            this.j.setVisibility(i2);
        }
        Drawable icon = aja.getIcon();
        boolean z = this.a.i.h;
        z = this.e;
        if (z || this.c) {
            ImageView imageView = this.f;
            if (!(imageView == null && icon == null && !this.c)) {
                if (imageView == null) {
                    this.f = (ImageView) c().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    a(this.f, 0);
                }
                if (icon == null && !this.c) {
                    this.f.setVisibility(8);
                } else {
                    imageView = this.f;
                    if (!z) {
                        icon = null;
                    }
                    imageView.setImageDrawable(icon);
                    if (this.f.getVisibility() != 0) {
                        this.f.setVisibility(0);
                    }
                }
            }
        }
        setEnabled(aja.isEnabled());
        isCheckable = aja.hasSubMenu();
        ImageView imageView2 = this.k;
        if (imageView2 != null) {
            if (!isCheckable) {
                i = 8;
            }
            imageView2.setVisibility(i);
        }
        setContentDescription(aja.k);
    }

    private final void a(View view) {
        a(view, -1);
    }

    private final void a(View view, int i) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final aja a() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private final LayoutInflater c() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top += (this.b.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
        }
    }
}
