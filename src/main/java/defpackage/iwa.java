package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: iwa */
public final class iwa extends akpl {
    public final aaas a;
    private final akkq b;
    private final akou c;
    private final Resources d;
    private final LayoutInflater e;
    private final View f = this.e.inflate(R.layout.watch_card_list, null);
    private LinearLayout g;
    private azie h;
    private boolean i;
    private int j;

    public iwa(Context context, akkq akkq, flu flu, aaas aaas) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (akou) amqw.a((Object) flu);
        this.a = (aaas) amqw.a((Object) aaas);
        this.d = context.getResources();
        this.e = LayoutInflater.from(context);
        flu.a(this.f);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        azie azie = (azie) obj;
        int i = 0;
        if (!azie.equals(this.h)) {
            this.i = false;
        }
        if (this.i && this.d.getConfiguration().orientation == this.j) {
            this.c.a(akor);
            return;
        }
        arml arml;
        arml arml2;
        this.h = azie;
        if (!this.i) {
            arml arml3;
            apxu apxu;
            this.g = (LinearLayout) this.f.findViewById(R.id.watch_card_items);
            TextView textView = (TextView) this.f.findViewById(R.id.card_title);
            if ((azie.a & 1) != 0) {
                arml3 = azie.b;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            } else {
                arml3 = null;
            }
            textView.setText(ajqy.a(arml3));
            if ((azie.a & 2) != 0) {
                apxu = azie.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
            textView.setOnClickListener(new iwd(this, apxu));
            textView = (TextView) this.f.findViewById(R.id.related_entities_title);
            LinearLayout linearLayout = (LinearLayout) this.f.findViewById(R.id.related_entities);
            ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
            azik azik = azie.e;
            if (azik == null) {
                azik = azik.d;
            }
            anyd anyd = azik.c;
            if (anyd.isEmpty()) {
                viewGroup.setVisibility(8);
                textView.setVisibility(8);
            } else {
                azik azik2 = azie.e;
                if (azik2 == null) {
                    azik2 = azik.d;
                }
                if ((azik2.a & 1) != 0) {
                    azik2 = azie.e;
                    if (azik2 == null) {
                        azik2 = azik.d;
                    }
                    arml = azik2.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                textView.setText(ajqy.a(arml));
                viewGroup.setVisibility(0);
                linearLayout.removeAllViews();
                while (i < anyd.size()) {
                    azim azim = (azim) anyd.get(i);
                    View inflate = this.e.inflate(R.layout.watch_card_related_entity_fixed_width, null);
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
                    akkq akkq = this.b;
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
                    aygk aygk = azim.c;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    akkq.a(imageView, aygk);
                    apxu apxu2 = azim.d;
                    if (apxu2 == null) {
                        apxu2 = apxu.d;
                    }
                    inflate.setOnClickListener(new iwe(this, apxu2));
                    if (i == 0) {
                        inflate.setPadding(inflate.getPaddingRight(), inflate.getPaddingTop(), inflate.getPaddingRight(), inflate.getPaddingBottom());
                    }
                    linearLayout.addView(inflate);
                    i++;
                }
            }
        }
        this.g.removeAllViews();
        for (azic azic : azie.d) {
            i = azic.a;
            LinearLayout linearLayout2;
            View inflate2;
            apxu apxu3;
            View findViewById;
            TextView textView3;
            arml arml4;
            TextView textView4;
            if (i == 63271829) {
                arml arml5;
                linearLayout2 = this.g;
                azii azii = (azii) azic.b;
                inflate2 = this.e.inflate(R.layout.watch_card_radio, null);
                if ((azii.a & 32) != 0) {
                    apxu3 = azii.f;
                    if (apxu3 == null) {
                        apxu3 = apxu.d;
                    }
                } else {
                    apxu3 = null;
                }
                inflate2.setOnClickListener(new iwc(this, apxu3));
                findViewById = inflate2.findViewById(R.id.radio_item);
                PlaylistThumbnailView playlistThumbnailView = (PlaylistThumbnailView) findViewById.findViewById(R.id.playlist_thumbnail);
                aygk aygk2 = azii.b;
                if (aygk2 == null) {
                    aygk2 = aygk.f;
                }
                playlistThumbnailView.b(aklb.b(aygk2));
                this.b.a(playlistThumbnailView.a, aygk2);
                textView3 = (TextView) findViewById.findViewById(R.id.title);
                if ((azii.a & 4) != 0) {
                    arml4 = azii.c;
                    if (arml4 == null) {
                        arml4 = arml.f;
                    }
                } else {
                    arml4 = null;
                }
                textView3.setText(ajqy.a(arml4));
                textView4 = (TextView) findViewById.findViewById(R.id.owner);
                if ((azii.a & 16) != 0) {
                    arml = azii.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                textView4.setText(ajqy.a(arml));
                YouTubeTextView youTubeTextView = playlistThumbnailView.b;
                if ((azii.a & 8) != 0) {
                    arml5 = azii.d;
                    if (arml5 == null) {
                        arml5 = arml.f;
                    }
                } else {
                    arml5 = null;
                }
                youTubeTextView.setText(ajqy.a(arml5));
                linearLayout2.addView(inflate2);
            } else if (i == 63336837) {
                linearLayout2 = this.g;
                azig azig = (azig) azic.b;
                inflate2 = this.e.inflate(R.layout.watch_card_playlist, null);
                if ((azig.a & 32) != 0) {
                    apxu3 = azig.f;
                    if (apxu3 == null) {
                        apxu3 = apxu.d;
                    }
                } else {
                    apxu3 = null;
                }
                inflate2.setOnClickListener(new iwf(this, apxu3));
                findViewById = inflate2.findViewById(R.id.playlist_item);
                textView3 = (TextView) findViewById.findViewById(R.id.title);
                if ((azig.a & 4) != 0) {
                    arml4 = azig.c;
                    if (arml4 == null) {
                        arml4 = arml.f;
                    }
                } else {
                    arml4 = null;
                }
                textView3.setText(ajqy.a(arml4));
                textView4 = (TextView) findViewById.findViewById(R.id.owner);
                if ((azig.a & 16) != 0) {
                    arml2 = azig.e;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                xpr.a(textView4, ajqy.a(arml2));
                PlaylistThumbnailView playlistThumbnailView2 = (PlaylistThumbnailView) findViewById.findViewById(R.id.playlist_thumbnail);
                TextView textView5 = playlistThumbnailView2.b;
                if ((azig.a & 8) != 0) {
                    arml = azig.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                xpr.a(textView5, ajqy.a(arml));
                akkq akkq2 = this.b;
                ImageView imageView2 = playlistThumbnailView2.a;
                aygk aygk3 = azig.b;
                if (aygk3 == null) {
                    aygk3 = aygk.f;
                }
                akkq2.a(imageView2, aygk3);
                linearLayout2.addView(inflate2);
            }
        }
        this.i = true;
        this.j = this.d.getConfiguration().orientation;
        this.c.a(akor);
    }
}
