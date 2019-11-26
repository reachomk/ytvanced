package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hwx */
public final class hwx {
    public final Activity a;
    public final aaas b;
    public AlertDialog c;
    public View d;
    private RadioGroup e;

    public hwx(Activity activity, aaas aaas) {
        this.a = activity;
        this.b = aaas;
    }

    public final void a(avum avum) {
        if (this.c == null) {
            arml arml;
            this.d = LayoutInflater.from(this.a).inflate(R.layout.options_dialog, null, false);
            ((TextView) this.d.findViewById(R.id.content_owner_rights)).setMovementMethod(LinkMovementMethod.getInstance());
            this.e = (RadioGroup) this.d.findViewById(R.id.option_items_list);
            for (avuc avuc : avum.b) {
                RadioButton radioButton = new RadioButton(this.a);
                int i = avuc.a;
                Object obj;
                arml arml2;
                if ((i & 8) != 0) {
                    obj = avuc.e;
                    if (obj == null) {
                        obj = avum.e;
                    }
                    radioButton.setTag(obj);
                    avum avum2 = avuc.e;
                    if (avum2 == null) {
                        avum2 = avum.e;
                    }
                    if ((avum2.a & 1) == 0) {
                        arml2 = null;
                    } else {
                        avum avum3 = avuc.e;
                        if (avum3 == null) {
                            avum3 = avum.e;
                        }
                        arml2 = avum3.c;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    }
                    radioButton.setText(ajqy.a(arml2));
                } else if ((i & 2) != 0) {
                    obj = avuc.c;
                    if (obj == null) {
                        obj = avui.d;
                    }
                    radioButton.setTag(obj);
                    avui avui = avuc.c;
                    if (avui == null) {
                        avui = avui.d;
                    }
                    if ((avui.a & 1) != 0) {
                        avui avui2 = avuc.c;
                        if (avui2 == null) {
                            avui2 = avui.d;
                        }
                        arml2 = avui2.b;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    radioButton.setText(ajqy.a(arml2));
                } else if ((i & 1) != 0) {
                    obj = avuc.b;
                    if (obj == null) {
                        obj = avue.d;
                    }
                    radioButton.setTag(obj);
                    avue avue = avuc.b;
                    if (avue == null) {
                        avue = avue.d;
                    }
                    if ((avue.a & 1) != 0) {
                        avue avue2 = avuc.b;
                        if (avue2 == null) {
                            avue2 = avue.d;
                        }
                        arml2 = avue2.b;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    radioButton.setText(ajqy.a(arml2));
                }
                radioButton.setTextColor(this.a.getResources().getColor(R.color.dialog_font));
                this.e.addView(radioButton);
            }
            Builder builder = new Builder(this.a);
            if ((avum.a & 1) != 0) {
                arml = avum.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            AlertDialog create = builder.setTitle(ajqy.a(arml)).setView(this.d).setPositiveButton(R.string.report_button, null).setNegativeButton(R.string.cancel, null).create();
            this.e.setOnCheckedChangeListener(new hwz(create));
            this.c = create;
        }
        this.c.show();
        this.e.clearCheck();
        this.c.getButton(-1).setOnClickListener(new hxa(this));
    }
}
