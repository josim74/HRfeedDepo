package josim74.git.com.hrfeeddepo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderRequest extends Fragment {

    private ImageButton imageButton;
    private View mview;
    public OrderRequest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mview = inflater.inflate(R.layout.fragment_order_request, container, false);
        imageButton = mview.findViewById(R.id.imgbtn_go_details_OrderRequest);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent orderDetailsIntent = new Intent(getActivity(), OrderDetailsActivity.class);
                startActivity(orderDetailsIntent);
            }
        });

        return mview;
    }

}
