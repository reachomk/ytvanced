package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: fed */
public final class fed {
    public static CharSequence a(List list) {
        Spanned a;
        Iterator it = list.iterator();
        do {
            arml arml = null;
            if (!it.hasNext()) {
                return null;
            }
            ayam ayam;
            ayas ayas = (ayas) it.next();
            if (ayas.a == 84469192) {
                ayam = (ayam) ayas.b;
            } else {
                ayam = ayam.e;
            }
            if ((ayam.a & 2) != 0) {
                arml = ayam.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            a = ajqy.a(arml);
        } while (TextUtils.isEmpty(a));
        return a;
    }

    public static CharSequence b(List list) {
        CharSequence charSequence;
        int size = list.size();
        while (true) {
            size--;
            charSequence = null;
            if (size < 0) {
                break;
            }
            ayam ayam;
            arml arml;
            ayas ayas = (ayas) list.get(size);
            if (ayas.a == 84469192) {
                ayam = (ayam) ayas.b;
            } else {
                ayam = ayam.e;
            }
            if ((ayam.a & 2) != 0) {
                arml = ayam.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            charSequence = ajqy.a(arml);
            if (!TextUtils.isEmpty(charSequence)) {
                break;
            }
        }
        return charSequence;
    }

    public static void a(View view, ayam ayam, akvp akvp, OnClickListener onClickListener) {
        View findViewById = view.findViewById(R.id.hats_response_text);
        View view2 = (ImageView) view.findViewById(R.id.hats_response_icon);
        if (view2 != null) {
            arml arml = null;
            if (findViewById != null) {
                TextView textView = (TextView) findViewById;
                if ((ayam.a & 2) != 0) {
                    arml = ayam.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                textView.setText(ajqy.a(arml));
            } else {
                if ((ayam.a & 2) != 0) {
                    arml = ayam.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                view2.setContentDescription(ajqy.a(arml));
            }
            boolean z = true;
            if ((ayam.a & 1) != 0) {
                arwf arwf = ayam.b;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                view2.setImageResource(akvp.a(a));
            }
            if ((ayam.a & 1) == 0) {
                z = false;
            }
            xpr.a(view2, z);
            view.setOnClickListener(onClickListener);
        }
    }

    public static View a(Context context, ViewGroup viewGroup, boolean z) {
        return LayoutInflater.from(context).inflate(!z ? R.layout.hats_horizontal_survey_option : R.layout.hats_vertical_survey_option, viewGroup, false);
    }
}
