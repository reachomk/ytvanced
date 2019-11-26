package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;

/* renamed from: kcz */
public final class kcz {
    public static final void a(Resources resources, auma auma, LayoutParams layoutParams, LayoutParams layoutParams2) {
        if (auma == null) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
            layoutParams2.weight = 1.0f;
            return;
        }
        int a = aumc.a(auma.b);
        if (a == 0) {
            a = 2;
        }
        a--;
        if (a == 5) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_bigger_thumbnail_width);
            layoutParams2.weight = 1.0f;
        } else if (a == 6) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_compact_thumbnail_width);
            layoutParams2.weight = 1.0f;
        } else if (a == 7) {
            layoutParams.weight = 1.0f;
            layoutParams2.weight = 0.0f;
            layoutParams2.width = (int) resources.getDimension(R.dimen.list_item_fixed_metadata_width);
        } else if (a != 8) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
            layoutParams2.weight = 1.0f;
        } else {
            layoutParams.width = -1;
            layoutParams.weight = 1.0f;
            layoutParams2.weight = 1.0f;
        }
    }

    public static final void a(Resources resources, auma auma, PlaylistThumbnailView playlistThumbnailView, RelativeLayout relativeLayout, TextView textView) {
        ViewGroup.LayoutParams layoutParams = playlistThumbnailView.getLayoutParams();
        if (auma != null) {
            int integer = resources.getInteger(R.integer.compact_renderer_title_max_lines);
            int a = aumc.a(auma.b);
            if (a == 0) {
                a = 2;
            }
            if (playlistThumbnailView.getParent() instanceof LinearLayout) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                layoutParams2.weight = 0.0f;
                if (a == 8 || a == 9) {
                    layoutParams2.weight = 1.0f;
                }
                if (relativeLayout != null) {
                    layoutParams2 = (LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams2.weight = 0.0f;
                    if (a == 9) {
                        layoutParams2.weight = 1.0f;
                    }
                }
            }
            a--;
            if (a == 5) {
                layoutParams.width = (int) resources.getDimension(R.dimen.list_item_bigger_thumbnail_width);
                playlistThumbnailView.b((int) R.dimen.large_font_size);
            } else if (a == 6) {
                integer = resources.getInteger(R.integer.compact_renderer_title_smaller_thumbnail_max_lines);
                layoutParams.width = (int) resources.getDimension(R.dimen.list_item_compact_thumbnail_width);
                playlistThumbnailView.b((int) R.dimen.medium_font_size);
            } else if (a == 7) {
                if (relativeLayout != null) {
                    relativeLayout.getLayoutParams().width = (int) resources.getDimension(R.dimen.list_item_fixed_metadata_width);
                }
                playlistThumbnailView.b((int) R.dimen.large_font_size);
            } else if (a != 8) {
                layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
                playlistThumbnailView.b((int) R.dimen.large_font_size);
            } else {
                if (relativeLayout != null) {
                    relativeLayout.getLayoutParams().width = -1;
                    layoutParams.width = -1;
                }
                playlistThumbnailView.b((int) R.dimen.large_font_size);
            }
            textView.setMaxLines(integer);
        }
    }

    public static final int a(Resources resources, auma auma) {
        if (auma == null) {
            return resources.getInteger(R.integer.compact_renderer_title_max_lines);
        }
        int a = aumc.a(auma.b);
        if (a == 0 || a != 7) {
            return resources.getInteger(R.integer.compact_renderer_title_max_lines);
        }
        return resources.getInteger(R.integer.compact_renderer_title_smaller_thumbnail_max_lines);
    }

    public static final boolean a(auma auma) {
        if (auma != null) {
            int a = aumc.a(auma.b);
            if (a != 0 && a == 10) {
                return true;
            }
        }
        return false;
    }
}
