package com.devanshusuthar.uniguide.Viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.devanshusuthar.uniguide.R;

public class CreateViewAdapterSteps extends FragmentStateAdapter {

    public CreateViewAdapterSteps(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return InitialStepsFragment.newInstance("Health Insurance & Health Card", "- Get your Health Insurance activated\n" +
                    "- For students it is already included in the college fees, students can get details about it by reaching out International Student Department in college\n" +
                    "- For those who are not students, they have to contact the company they have opt for the Insurance or else they can get one from various companies.\n" +
                    "- People need to go to nearby Service Ontario for their Health Card.\n" +
                    "- If you already have your insurance then you need to call to customer care of that particular company with your policy number and ask what we need to do to activate our Health Insurance & it not when it can be done.\n" +
                    "- Get information about your Insurance like what amount will it cover? what benefits you will get? How much it will cover with Hospitals, Clinics, Dental, Eyes related etc?\n" +
                    "- Medical is Expensive here."
                    );
            case 1: return InitialStepsFragment.newInstance("Bus Pass / Transit Pass",
                    "- Get your Bus pass or Transit Pass or Presto Card for traveling\n" +
                    "- You bus pass will be provided from the college and the fees in regards to that is inclusive in your semester fees.\n" +
                    "- You may also buy your own pass through Bus Terminal or Shoppers Drug Mart.\n"+
                    "- It is very convenient for your day to day commute.\n" +
                    "- If you need some more info you can contact your college or Bus terminal.");
            case 2: return InitialStepsFragment.newInstance("Social Insurance Number","To obtain a Social Insurance Number (SIN) in Canada:\n" +
                    "\n" +
                    "1. For Temporary Residents (e.g., International Students):\n" +
                    "   - Visit a Service Canada office in person.\n" +
                    "   - Bring original documents proving identity and status in Canada.\n" +
                    "   - Download and complete the SIN application form.\n" +
                    "   - Submit the application and wait for processing.\n" +
                    "\n" +
                    "2. For Canadian Citizens and Permanent Residents:\n" +
                    "   - Canadian citizens usually get a SIN at birth; permanent residents receive one upon immigration.\n" +
                    "   - If not, visit a Service Canada office with required documents.\n" +
                    "   - Complete the SIN application form, submit it in person, and wait for processing.\n" +
                    "\n" +
                    "Important Tips:\n" +
                    "- Apply in person; online applications for initial SIN are not available.\n" +
                    "- Authorized representatives can apply on your behalf with proper documentation.\n" +
                    "- Check the official Service Canada website for the latest information.");

            case 3: return InitialStepsFragment.newInstance("Bank Account", "When students arrive in Canada and want to open a Guaranteed Investment Certificate (GIC) account, they typically need the following:\n" +
                    "\n" +
                    "1. Acceptance Letter: A letter from the educational institution in Canada confirming the student's acceptance into a program.\n" +
                    "\n" +
                    "2. Passport and Study Permit: A valid passport and study permit, which allows the student to study in Canada.\n" +
                    "\n" +
                    "3. Proof of Identity: Additional identification documents, such as a driver's license or national ID card.\n" +
                    "\n" +
                    "4. Proof of Address: Some banks may require proof of address in Canada, which could include a rental agreement or a letter from the institution.\n" +
                    "\n" +
                    "5. Social Insurance Number (SIN): A Social Insurance Number may be required for certain banking transactions. It's obtained from Service Canada.\n" +
                    "\n" +
                    "6. Initial Deposit: The student will need to deposit the required amount into the GIC account as per the immigration regulations. This amount is usually specified by the financial institution.\n" +
                    "\n" +
                    "7. GIC Application Form: Complete the application form provided by the bank for opening a GIC account.\n" +
                    "\n" +
                    "8. Banking Fees: Be prepared for any applicable banking fees associated with opening and maintaining the GIC account.\n" +
                    "\n" +
                    "It's important to note that requirements may vary slightly depending on the bank or financial institution, so students should contact the specific institution where they plan to open their GIC account for the most accurate and up-to-date information.\n" +
                    "\n" +
                    "Here is the list of various Bank with their website and their Customer Care Number:\n" +
                            "\n" +
                    "\n" +
                    "Scotiabank:\n" +
                    "\n" +
                    "Website: https://www.scotiabank.com/\n" +
                    "Customer Care: 1-800-472-6842\n" +
                    "\n" +
                    "ICICI Bank Canada:\n" +
                    "\n" +
                    "Website: https://www.icicibank.com/\n" +
                    "Customer Care: 1-888-424-2422\n" +
                    "\n" +
                    "HSBC Bank Canada:\n" +
                    "\n" +
                    "Website: https://www.hsbc.ca/\n" +
                    "Customer Care: 1-888-310-4722\n" +
                    "\n" +
                    "SBI Canada Bank:\n" +
                    "\n" +
                    "Website: https://ca.statebank/\n" +
                    "Customer Care: 1-866-724-2669\n" +
                    "\n" +
                    "CIBC (Canadian Imperial Bank of Commerce):\n" +
                    "\n" +
                    "Website: https://www.cibc.com/\n" +
                    "Customer Care: 1-888-872-2422\n" +
                    "\n" +
                    "BMO (Bank of Montreal):\n" +
                    "\n" +
                    "Website: https://www.bmo.com/\n" +
                    "Customer Care: 1-877-225-5266");
            case 4: return InitialStepsFragment.newInstance("SIM Card", "To get a SIM card in Canada:\n" +
                    "\n" +
                    "1. Choose a mobile service provider (e.g., Rogers, Bell, Telus).\n" +
                    "2. Visit an official store or authorized retailer.\n" +
                    "3. Bring identification (passport or ID).\n" +
                    "4. Choose a prepaid or postpaid plan.\n" +
                    "5. Activate the SIM card online or by phone.\n" +
                    "6. Insert the activated SIM into your phone.\n" +
                    "7. Top up for prepaid or pay monthly for postpaid.");
            default: return InitialStepsFragment.newInstance("Error","Page not found");
        }
    }


    @Override
    public int getItemCount() {
        return 5;
    }
}
