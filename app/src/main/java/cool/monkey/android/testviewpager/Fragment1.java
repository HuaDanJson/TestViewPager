package cool.monkey.android.testviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class Fragment1 extends Fragment {

    @BindView(R.id.tv_item_fragment1) TextView tvItemFragment1;

    private String questions[] = {"问题1", "问题2", "问题3", "问题4", "问题5"};
    private String answerA[] = {"答案A", "答案A", "答案A", "答案A", "答案A"};
    private String answerB[] = {"答案B", "答案B", "答案B", "答案B", "答案B"};
    private String answerC[] = {"答案C", "答案C", "答案C", "答案C", "答案C"};
    private String answerD[] = {"答案D", "答案D", "答案D", "答案D", "答案D"};
    private String rightAnswer[] = {"A", "B", "C", "D", "D"};
    public int mPosition;
    Unbinder unbinder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setDate(int position) {
        this.mPosition = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        tvItemFragment1.setText(questions[mPosition]);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
