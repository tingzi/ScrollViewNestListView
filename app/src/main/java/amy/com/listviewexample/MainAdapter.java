package amy.com.listviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by amy on 17/8/5.
 */

public class MainAdapter extends BaseAdapter {

    private Context mContext;

    public MainAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
    //    Log.d("MainAdapter", "getView:" + i);
        TextView textView = new TextView(mContext);
        textView.setText("text:" + i);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                100);
        textView.setLayoutParams(params);
        return textView;
    }
}
