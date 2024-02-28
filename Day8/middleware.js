const checkcreds = (req, res, next) => {
    const { name, email, password, cpassword } = req.body;
  
    if (password != cpassword) {
      return res.send("password not matching");
   
    }
    next();
  };
  module.exports = { checkcreds };

  onst login=('/login',(req,res)=>{
    res.send("i am login")
})
const logout=('/logout',(req,res)=>{
    res.send("i am logout")
})

const signup=('/signup',(req,res)=>{
    console.log(req.body);
        res.send(req.body)
})

const forgotpassword=('/forgotpassword',(req,res)=>{
    res.send("i am forgetpassword")
})




module.exports={login,logout,signup,forgotpassword}