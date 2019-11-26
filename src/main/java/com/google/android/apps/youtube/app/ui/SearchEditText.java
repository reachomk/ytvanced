package com.google.android.apps.youtube.app.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Selection;
import android.util.AttributeSet;
import android.widget.EditText;

public class SearchEditText extends EditText {
    public SearchEditText(Context context) {
        super(context);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                int i2;
                StringBuilder stringBuilder = new StringBuilder();
                int i3 = 0;
                for (i2 = 0; i2 < primaryClip.getItemCount(); i2++) {
                    stringBuilder.append(primaryClip.getItemAt(i2).coerceToText(getContext()));
                }
                int length = getText().length();
                if (isFocused()) {
                    length = getSelectionStart();
                    i2 = getSelectionEnd();
                    int max = Math.max(0, Math.min(length, i2));
                    length = Math.max(0, Math.max(length, i2));
                    i3 = max;
                }
                Selection.setSelection(getText(), length);
                getText().replace(i3, length, stringBuilder.toString());
                return true;
            }
        }
        return super.onTextContextMenuItem(i);
    }
}
